import { Box, Container } from "@mui/material";
import Categories from "../Elements/LandingPage/Categories";
import DailyRecipe from "../Elements/LandingPage/DailyRecipe";
import Navbar from "../Elements/Navbar";
import { makeStyles } from "@mui/styles";
import LatestBlog from "../Elements/LandingPage/LatestBlog";
import React from "react";

const useStyles = makeStyles({
  hero: {
    display: "flex",
    justifyContent: "space-between",
    marginTop: 50,
    marginRight: 30,
    marginLeft: 30,
    gap: 100,
  },
});

const LandingPage = () => {
  const classes = useStyles();

  return (
    <>
      <Container maxWidth="xl">
        <Navbar />
        <Box className={classes.hero}>
          <Box sx={{ flexGrow: 1 }}>
            <DailyRecipe />
            <LatestBlog />
          </Box>
          <Box>
            <Categories />
          </Box>
        </Box>
      </Container>
    </>
  );
};

export default LandingPage;
