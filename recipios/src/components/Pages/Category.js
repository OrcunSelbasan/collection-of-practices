import {
  Button,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  Container,
  Typography,
} from "@mui/material";
import { makeStyles } from "@mui/styles";
import { Box } from "@mui/system";
import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router";
import { Link } from "react-router-dom";
import Navbar from "../Elements/Navbar";

const useStyles = makeStyles({
  header: {
    textAlign: "center",
    marginTop: 50,
    marginBottom: 30,
  },
  recipes: {
    display: "flex",
    justifyContent: "space-around",
    flexWrap: "wrap",
  },
  card: {
    margin: 2,
    marginBottom: 20,
  },
  button: {
    color: "blue",
    textDecoration: "none",
  },
});

const Category = () => {
  let { category } = useParams();
  const classes = useStyles();

  const [meals, setMeals] = useState([]);

  useEffect(() => {
    axios
      .get(`https://www.themealdb.com/api/json/v1/1/filter.php?c=${category}`)
      .then((response) => {
        setMeals(response.data.meals);
        return response.data.meals;
      })
      .catch((err) => {
        console.log(err);
      });
  });

  return (
    <>
      <Navbar />
      <Box className={classes.header}>
        <Typography variant="h3" sx={{ color: "#f2f2f2" }}>
          {category}
        </Typography>
      </Box>
      <Box>
        <Typography variant="body1"></Typography>
      </Box>
      <Container maxWidth="xl">
        <Box className={classes.recipes}>
          {meals.map((meal) => (
            <>
              <Card sx={{ borderRadius: 3 }} className={classes.card}>
                <Box
                  p={3}
                  minWidth={360}
                  sx={{ backgroundColor: "#753D41" }}
                >
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
                      className={classes.button}
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

export default Category;
