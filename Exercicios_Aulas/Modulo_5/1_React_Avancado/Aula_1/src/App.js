import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";
import Main from "./pages/Main";
import TodoV1 from "./pages/TodoV1";
import TodoV2 from "./pages/TodoV2";
import NavBar from "./pages/NavBar";


export default function App() {
  return (
    <Router>
        <NavBar/>
        <Routes>
          <Route exact path="/" element={<Main/>}/>
          <Route path="/versao1" element={<TodoV1/>}/>
          <Route path="/versao2" element={<TodoV2/>}/>
        </Routes>
    </Router>
  );
}


function AppOld() {
  return (
    <Router>
      <div>
        <ul>
          <li><Link to="/">Home</Link></li>
          <li><Link to="/versao1">Todo V1</Link></li>
          <li><Link to="/versao2">Todo V2</Link></li>
        </ul>
        <hr />
        <Routes>
          <Route exact path="/" element={<Main/>}/>
          <Route path="/versao1" element={<TodoV1/>}/>
          <Route path="/versao2" element={<TodoV2/>}/>
        </Routes>
      </div>
    </Router>
  );
}
