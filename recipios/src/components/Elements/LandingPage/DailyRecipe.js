import { faChevronRight } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  Button,
  Card,
  CardActions,
  CardContent,
  Typography,
} from "@mui/material";
import { Box } from "@mui/system";
import axios from "axios";
import { format } from "date-fns";
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import AccessTimeIcon from "@mui/icons-material/AccessTime";
import Paper from "@mui/material/Paper";
import InputBase from "@mui/material/InputBase";
import IconButton from "@mui/material/IconButton";
import SearchIcon from "@mui/icons-material/Search";

const DailyRecipe = () => {
  const [time, setTime] = useState(format(new Date(), "dd MMM HH:mm:ss"));
  const [meal, setMeal] = useState([]);
  const [instr, setInstr] = useState("");

  useEffect(() => {
    setInterval(() => {
      const date = format(new Date(), "dd MMM HH:mm:ss");
      setTime(date);
    }, 1000);
  });

  useEffect(() => {
    axios
      .get(`https://www.themealdb.com/api/json/v1/1/random.php`)
      .then((response) => {
        setMeal(response.data.meals[0]);
        setInstr(response.data.meals[0].strInstructions.substring(0, 500));
        return response.data.meals[0];
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  return (
    <Box>
      <Box
        px={2}
        py={1}
        my={1}
        sx={{
          display: "flex",
          alignItems: "center",
          flexWrap: "nowrap",
        }}
      >
        <Typography
          px={2}
          py={1}
          my={1}
          sx={{
            fontSize: 24,
            display: "flex",
            marginRight: 5,
            alignItems: "center",
            backgroundColor: "#B55E64",
            color: "#fff",
            borderRadius: 2,
            width: "max-content",
          }}
        >
          <AccessTimeIcon sx={{ marginRight: 1 }} fontSize="large" />
          {time}
        </Typography>
        <Paper
          component="form"
          sx={{         
            height: 50,
            display: "flex",
            alignItems: "center",
            flexGrow: 1
          }}
        >
          <InputBase
            sx={{ ml: 1, flex: 1 }}
            placeholder="Search for a recipe"
            inputProps={{ "aria-label": "Search for a recipe" }}
          />
          <IconButton type="submit" sx={{ p: "10px" }} aria-label="search">
            <SearchIcon />
          </IconButton>
        </Paper>
      </Box>
      <Card variant="outlined">
        <React.Fragment>
          <CardContent sx={{ backgroundColor: "#F58087", padding: 0 }}>
            <Box px={3} py={2} sx={{ backgroundColor: "#F58087" }}>
              <Typography
                sx={{ fontSize: 14 }}
                color="text.secondary"
                gutterBottom
              >
                {meal.strArea}
              </Typography>
              <Typography variant="h5" component="div">
                {meal.strMeal}
              </Typography>
              <Typography sx={{ mb: 1.5 }} color="text.secondary">
                {meal.strCategory}
              </Typography>
            </Box>
            <Box
              p={3}
              sx={{
                display: "flex",
                gap: 10,
                alignItems: "center",
                backgroundColor: "#B55E64",
              }}
            >
              <img
                style={{ border: "1px solid white", borderRadius: 5 }}
                height={210}
                src={`${meal.strMealThumb}`}
                alt=""
              />
              <Typography>{instr}...</Typography>
            </Box>
          </CardContent>
          <CardActions
            sx={{
              justifyContent: "end",
              backgroundColor: "#F58087",
              borderTop: "1px solid #fff",
            }}
          >
            <Link
              style={{ textDecoration: "none" }}
              to={`/recipe/${meal.idMeal}`}
            >
              <Button
                sx={{ color: "#753D41", fontWeight: "bold" }}
                size="large"
              >
                Learn More About {meal.strMeal}{" "}
                <FontAwesomeIcon
                  style={{ fontSize: 30, marginLeft: 25 }}
                  icon={faChevronRight}
                />
              </Button>
            </Link>
          </CardActions>
        </React.Fragment>
      </Card>
    </Box>
  );
};

export default DailyRecipe;
