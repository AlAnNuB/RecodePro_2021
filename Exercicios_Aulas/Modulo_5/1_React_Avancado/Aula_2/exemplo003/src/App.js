import React from 'react';
import {lazy, Suspense} from 'react';
import {Spinner} from 'react-bootstrap'
import 'bootstrap/dist/css/bootstrap.css';

import logo from './logo.svg';
import './App.css';
// Antigo...
//import Slogan from "./Slogan";
//import Rodape from './Rodape';

// Lazy Loading....
const Slogan = lazy(() => import("./Slogan.js"));
const Rodape = lazy(() => import("./Rodape.js"));

function Loading(){
  return(
    <Spinner animation="border" role="status">
      <span className="visually-hidden">Loading...</span>
    </Spinner>
  );
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Suspense fallback={<Loading/>}>
          <Slogan/>
        </Suspense>
        <Suspense fallback={<Loading/>}>
          <Rodape/>
        </Suspense>
      </header>
    </div>
  );
}

export default App;
