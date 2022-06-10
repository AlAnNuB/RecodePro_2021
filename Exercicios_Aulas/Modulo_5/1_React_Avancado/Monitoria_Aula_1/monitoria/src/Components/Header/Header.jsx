import React from "react";
import Navbar from '../Navbar/Navbar';
import './Header.css'

export default () => {
    return (
        <header>
            <Navbar></Navbar>
            <div className="slogan container-fluid">
                <div>
                    <h2>Sua</h2>
                    <h2>Monitoria</h2>
                    <h2>aqui.</h2>
                </div>
                <div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi est id dignissimos, hic blanditiis nihil
                        ipsum nobis minima! Earum ipsam sunt velit facilis adipisci necessitatibus.</p>
                </div>
                <div>
                    <button type="button"><a href="https://www.linkedin.com/in/guilhermesilva2/" target="_blank"><i
                        className="bi bi-linkedin"></i>Cris</a></button>
                    <button type="button"><a href="https://www.linkedin.com/in/caioteixeiradev/" target="_blank">Greg<i
                        className="bi bi-linkedin"></i></a></button>
                </div>
            </div>
        </header>
    );
}