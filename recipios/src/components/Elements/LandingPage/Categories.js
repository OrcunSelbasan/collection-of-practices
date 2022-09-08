import {
  List,
  ListItemButton,
  ListItemIcon,
  Typography,
} from "@mui/material";
import { Link } from "react-router-dom";
import { useEffect, useState } from "react";
import { makeStyles } from "@mui/styles";

const useStyles = makeStyles({
  subheader: {
    color: "#ffffff",
    textDecoration: "none",
  },
  listItem: {
    color: "black",
    textDecoration: "none",
    '&:hover': {
      color: "white",
    },
  },
  categories: {
    backgroundColor: "#F58087",
    width: "100%",
    maxWidth: 360,
    border: "5px solid white",
    borderRadius: 25,
  }
});

const dataIcons = require("./categories.json");
const axios = require("axios");

const Categories = () => {
  const [meals, setMeals] = useState([]);
  const classes = useStyles();

  useEffect(() => {
    axios
      .get("https://www.themealdb.com/api/json/v1/1/categories.php")
      .then((response) => {
        setMeals(response.data.categories);
        return response.data.categories;
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <List
      component="div"
      className={classes.categories}
      aria-labelledby="nested-list-subheader"
      subheader={
        <Typography
          py={2}
          sx={{ textAlign: "center", fontSize: 20, backgroundColor: "#753D41", borderTopLeftRadius: 20, borderTopRightRadius: 20 }}
          component="div"
        >
          <Link className={classes.subheader} to="/categories">
            Categories
          </Link>
        </Typography>
      }
    >
      {meals.map((meal, index) => (
        <Link
          className={classes.listItem}
          to={`/categories/${meal.strCategory}`}
          key={index}
        >
          <ListItemButton>
            <ListItemIcon>
              <img
                src={dataIcons.filter(icon => icon[`${meal.strCategory}`])[0][`${meal.strCategory}`]}
                width="30"
                alt=""
              />
            </ListItemIcon>
            {meal.strCategory}
          </ListItemButton>
        </Link>
      ))}
    </List>
  );
};

export default Categories;
