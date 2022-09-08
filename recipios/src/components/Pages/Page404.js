import { Box } from "@mui/system";
import { Link } from "react-router-dom";

const Page404 = () => {
  return (
    <>
      <Box sx={{ textAlign: "center" }}>
        <p>404 - Sorry :(</p>
        <Link to="/">Go back to home page</Link>
      </Box>
    </>
  );
};

export default Page404;
