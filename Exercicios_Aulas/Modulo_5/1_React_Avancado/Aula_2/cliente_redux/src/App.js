import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";
import TodoRedux from "./pages/TodoRedux";
import TodoV1 from "./pages/TodoNet";

function App() {
  return (
    <Router>
      <div>
        <ul>
          <li><Link to="/toRedux">Todo Redux</Link></li>
          <li><Link to="/toNet">Todo Net</Link></li>
        </ul>
        <hr />
        <Routes>
          <Route exact path="/toRedux" element={<TodoRedux/>}/>
          <Route path="/toNet" element={<TodoV1/>}/>
        </Routes>
      </div>
    </Router>
  );
}

export default App;
