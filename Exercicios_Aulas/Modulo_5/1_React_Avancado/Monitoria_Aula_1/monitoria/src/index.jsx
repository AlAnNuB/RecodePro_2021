import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Home from './Pages/Home/Home';
import Login from './Pages/Login/Login';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

ReactDOM.render(
  <React.StrictMode>
      <Router>
        <Routes>
          <Route path="/" exact element={<Home/>}></Route>
          <Route path="/Login" element={<Login/>}></Route>
        </Routes>
      </Router>
  </React.StrictMode>,
  document.getElementById('root')
);
