import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  Button,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  Container,
  Typography,
} from "@mui/material";
import { Box } from "@mui/system";
import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router";
import { Link } from "react-router-dom";
import Navbar from "../Elements/Navbar";

const Cousine = () => {
  const { area } = useParams();
  const [meals, setMeals] = useState([]);

  useEffect(() => {
    axios
      .get(`https://www.themealdb.com/api/json/v1/1/filter.php?a=${area}`)
      .then((response) => {
        setMeals(response.data.meals);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <>
      <Navbar />
      <Container maxWidth="xl">
        <Box sx={{ display: "flex", gap: 10, flexWrap: "wrap" }}>
          {meals.map((meal) => (
            <>
              <Card sx={{ borderRadius: 3 }}>
                <Box p={3} minWidth={360} sx={{ backgroundColor: "#753D41" }}>
                  <CardContent
                    sx={{ textAlign: "center", backgroundColor: "#753D41" }}
                  >
                    <Typography
                      sx={{ color: "#f2f2f2" }}
                      variant="h5"
                      color="text.primary"
                      gutterBottom
                    >
                      {meal.strMeal}
                    </Typography>
                  </CardContent>
                  <CardMedia
                    sx={{ borderRadius: 2 }}
                    component="img"
                    height="194"
                    image={meal.strMealThumb}
                  />
                  <CardActions
                    sx={{
                      justifyContent: "center",
                      backgroundColor: "#753D41",
                    }}
                  >
                    <Link
                      style={{ textDecoration: "none" }}
                      to={`/recipe/${meal.idMeal}`}
                    >
                      <Button size="large" sx={{ color: "#f2f2f2" }}>
                        View Recipe
                      </Button>
                    </Link>
                  </CardActions>
                </Box>
              </Card>
            </>
          ))}
        </Box>
      </Container>
    </>
  );
};

export default Cousine;
