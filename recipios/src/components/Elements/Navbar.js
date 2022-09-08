import {
  Fab,
  Slide,
  Toolbar,
  Typography,
  useScrollTrigger,
  Zoom,
} from "@mui/material";
import { makeStyles } from "@mui/styles";
import { Box } from "@mui/system";
import { Link } from "react-router-dom";
import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faArrowUp } from "@fortawesome/free-solid-svg-icons";

function ScrollTop(props) {
  const { children, window } = props;
  // Note that you normally won't need to set the window ref as useScrollTrigger
  // will default to window.
  // This is only being set here because the demo is in an iframe.
  const trigger = useScrollTrigger({
    target: window ? window() : undefined,
    disableHysteresis: true,
    threshold: 100,
  });

  const handleClick = (event) => {
    const anchor = (event.target.ownerDocument || document).querySelector(
      "#back-to-top-anchor"
    );

    if (anchor) {
      anchor.scrollIntoView({
        behavior: "smooth",
        block: "center",
      });
    }
  };

  return (
    <Zoom in={trigger}>
      <Box
        onClick={handleClick}
        role="presentation"
        sx={{ position: "fixed", bottom: 16, right: 16 }}
      >
        {children}
      </Box>
    </Zoom>
  );
}

function HideOnScroll(props) {
  const { children, window } = props;

  const trigger = useScrollTrigger({
    target: window ? window() : undefined,
  });

  return (
    <Slide appear={false} direction="down" in={!trigger}>
      {children}
    </Slide>
  );
}

const useStyles = makeStyles({
  toolBar: {
    margin: "auto",
    marginTop: 10,
    minWidth: 360,
    width: "50%",
    backgroundColor: "#B55E64",
    borderRadius: 25,
    display: "flex",
    justifyContent: "space-between",
  },
  links: {
    fontSize: 24,
    fontWeight: "lighter",
    textDecoration: "none",
    color: "#fff",
    margin: 6,
    "&:visited": {
      color: "#fff",
    },
  },
  icon: {
    color: "white",
    fontSize: 24,
  },
});

const Navbar = (props) => {
  const classes = useStyles();

  return (
    <React.Fragment>
      <HideOnScroll {...props}>
        <Toolbar className={classes.toolBar}>
          <Typography>
            <Link className={classes.links} to="/">
              Recipios
            </Link>
          </Typography>

          <Typography>
            <div>
              <Link className={classes.links} to="/cousines">
                Cousines
              </Link>
              <Link className={classes.links} to="/blogs">
                Blogs{" "}
              </Link>
            </div>
          </Typography>
        </Toolbar>
      </HideOnScroll>
      <Toolbar id="back-to-top-anchor" />
      <ScrollTop {...props}>
        <Fab color="secondary" size="medium" aria-label="scroll back to top">
          <FontAwesomeIcon className={classes.icon} icon={faArrowUp} />
        </Fab>
      </ScrollTop>
    </React.Fragment>
  );
};

export default Navbar;
