import {
  Button,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  Container,
  Typography,
} from "@mui/material";
import axios from "axios";
import { useEffect, useState } from "react";
import Navbar from "../Elements/Navbar";
import dataCCN from "../Elements/Cousines/cousines.json";
import { Link } from "react-router-dom";
import { Box } from "@mui/system";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faChevronRight } from "@fortawesome/free-solid-svg-icons";

const Cousines = () => {
  const [cousines, setCousines] = useState([]);
  const [loaded, setLoaded] = useState(true)

  useEffect(() => {
    axios
      .get("https://www.themealdb.com/api/json/v1/1/list.php?a=list")
      .then((response) => {
        const data = response.data.meals;
        data.forEach((meal) => {
          if (meal.strArea === "Unknown") {
            return;
          } else {
              // COUSINES JSON CONVERT COUSINE TO COUNTRY
            const ccn = Object.values(
              dataCCN.filter((ccn) => meal.strArea === Object.keys(ccn)[0])[0]
            )[0];
            // GET COUNTRY
                            
            axios
            .get(`https://restcountries.com/v3.1/alpha/${ccn}`)
            .then((response) => {
                cousines.push([response.data[0], meal.strArea]);
                setCousines([...cousines])
              })
              .catch((err) => console.log(err));

            }
        });
        setLoaded(false);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <>
      <Navbar />
      <Typography sx={{ textAlign: "center", color: "#fff" }} variant="h3">
        Cousines
      </Typography>
      { loaded && <Typography sx={{ textAlign: "center", color: "#fff", fontSize: 36, marginTop: 25 }}>Loading...</Typography>}
      <Container maxWidth="xl">
        <Box
          my={5}
          sx={{
            display: "flex",
            justifyContent: "space-around",
            flexWrap: "wrap",
            gap: 3,
          }}
        >
          {cousines.map((country) => (
            <Card sx={{ maxWidth: 345, minWidth: 280 }}>
              <CardMedia
                component="img"
                height="140"
                image={country[0].flags.png}
                alt="green iguana"
              />
              <CardContent>
                <Typography gutterBottom variant="h5" component="div">
                  {country[1]} Cousine
                </Typography>
                <Typography variant="body2" color="text.secondary">
                  {"Region: " + country[0].region}
                </Typography>
              </CardContent>
              <CardActions sx={{ justifyContent: "center"}}>
                <Link
                  style={{ textDecoration: "none" }}
                  to={`/cousine/${country[1]}`}
                >
                  <Button sx={{ color: "#000" }} size="small">
                    Visit {country[1]} Cousine{" "}
                    <FontAwesomeIcon
                      style={{ fontSize: 24, marginLeft: 25 }}
                      icon={faChevronRight}
                    />
                  </Button>
                </Link>
              </CardActions>
            </Card>
          ))}
          <Card sx={{ maxWidth: 345, minWidth: 280 }}>
            <CardContent>
              <Typography gutterBottom variant="h5" component="div">
                Unkown Cousine
              </Typography>
              <Typography variant="body2" color="text.secondary">
                {"Region: Unknown"}
              </Typography>
            </CardContent>
            <CardActions >
              <Link style={{ textDecoration: "none" }} to={`/cousine/Unknown`}>
                <Button sx={{ color: "#000" }} size="small">
                  Visit Unknown Cousine
                  <FontAwesomeIcon
                  style={{ fontSize: 24, marginLeft: 25 }}
                  icon={faChevronRight}
                />
                </Button>
              </Link>
            </CardActions>
          </Card>
        </Box>
      </Container>
    </>
  );
};

export default Cousines;
