import { Container, List, ListItem, Typography } from "@mui/material";
import { Box } from "@mui/system";
import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router";
import Navbar from "../Elements/Navbar";

const Recipe = () => {
  const { id } = useParams();

  const [meal, setMeal] = useState([]);

  useEffect(() => {
    axios
      .get(`https://www.themealdb.com/api/json/v1/1/lookup.php?i=${id}`)
      .then((response) => {
        setMeal(response.data.meals[0]);
        return response.data.meals;
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  const ingredients = (object) => {
    let arr = [];
    for (let i = 1; i < 21; i++) {
      if (
        meal[`strIngredient${i}`] !== null &&
        meal[`strIngredient${i}`] !== ""
      ) {
        arr.push([meal[`strIngredient${i}`], meal[`strMeasure${i}`]]);
      }
    }
    return arr;
  };
  return (
    <>
      <Navbar />
      <Typography variant="h3" sx={{ textAlign: "center", color: "#f2f2f2" }}>
        {meal.strMeal}
      </Typography>
      <Typography variant="h4" sx={{ textAlign: "center", color: "#f2f2f2" }}>
        {meal.strArea}
      </Typography>
      <Container>
        <Box my={10} sx={{ justifyContent: "center", display: "flex", gap: 20 }}>
          <Box sx={{ width: "50%", textAlign: "end" }}>
            <img height="360" src={`${meal.strMealThumb}`} alt="" />
          </Box>
          <Box sx={{ width: "50%", display: "flex", alignItems: "center" }}>
            <List
              sx={{
                columnCount: 2,
                columnGap: 10,
                columnRule: "solid #fff 1px",
              }}
            >
              {ingredients(meal).map((ingredient, index) => (
                <ListItem key={index}>
                  <Typography variant="body1">
                    - {ingredient[0]} - {ingredient[1]}
                  </Typography>
                </ListItem>
              ))}
            </List>
          </Box>
        </Box>
        <Box my={5} p={5} sx={{ backgroundColor: "#753D41", borderRadius: 5, color: "#f2f2f2" }}>
          <Typography>
            {meal.strInstructions}
          </Typography>
        </Box>
      </Container>
    </>
  );
};

export default Recipe;
