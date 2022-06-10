import React from "react";
import {
  AppBar,
  Toolbar,
  CssBaseline,
  Typography,
  Grid,
  makeStyles,
} from "@material-ui/core";
import { Link } from "react-router-dom";

const useStyles = makeStyles((theme) => ({
  navlinks: {
    marginLeft: theme.spacing(10),
    display: "flex",
  },
 logo: {
    flexGrow: "1",
    cursor: "pointer",
  },
  link: {
    textDecoration: "none",
    color: "white",
    fontSize: "20px",
    "&:hover": {
      color: "yellow",
      borderBottom: "1px solid white",
    },
  },
}));

function NavBar() {
  const classes = useStyles();

  return (
    <AppBar position="static">
      <CssBaseline />
      <Toolbar>
        <Typography variant="h4" className={classes.logo}>
          Navbar
        </Typography>
        <Grid container className={classes.navlinks}>
            <Grid item xs={4}>
                <Link to="/" className={classes.link}>
                    Home
                </Link>
            </Grid>
            <Grid item xs={4}>
                <Link to="/versao1" className={classes.link}>
                    Todo V1
                </Link>
            </Grid>
            <Grid item xs={4}>
                <Link to="/versao2" className={classes.link}>
                    Todo V2
                </Link>
            </Grid>
        </Grid>
      </Toolbar>
    </AppBar>
  );
}
export default NavBar;
