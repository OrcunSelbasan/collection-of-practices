import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Blogs from "./components/Pages/Blogs";
import Categories from "./components/Pages/Categories";
import Category from "./components/Pages/Category";
import Cousine from "./components/Pages/Cousine";
import Cousines from "./components/Pages/Cousines";
import LandingPage from "./components/Pages/LandingPage";
import Page404 from "./components/Pages/Page404";
import Recipe from "./components/Pages/Recipe";

function App() {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<LandingPage/>} />
        <Route exact path="/recipe/:id" element={<Recipe />} />
        <Route exact path="/categories" element={<Categories />} />
        <Route exact path="/categories/:category" element={<Category />} />
        <Route exact path="/cousines" element={<Cousines />} />
        <Route exact path="/cousine/:area" element={<Cousine />} />
        <Route exact path="/blogs" element={<Blogs />} />
        <Route path="*" element={<Page404 />} />    
      </Routes>
    </Router>
  );
}

export default App;
