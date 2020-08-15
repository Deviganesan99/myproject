import React from "react";
import {Link,NavLink}from "react-router-dom";
import loginImg from "./login.svg";
import "./style.css";
import "./App.scss"

export class Login extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div className="base-container" ref={this.props.containerRef}>
        <div className="header">Login</div>
        <li><NavLink exact to ="/">Home</NavLink></li>
        <li><NavLink exact to ="/volunteerdetails">VolunteerDetails</NavLink></li>
        <div className="content">
          <div className="image">
           
          <img src="https://www.uwstclair.org/sites/uwstclair.org/files/rotor-volunteer.jpg"  width="300" height="200"></img>
          </div>
          <div className="form">
            <div className="form-group">
              <label htmlFor="username">Username</label>
              <input type="text" name="username" placeholder="username" />
            </div>
            <div className="form-group">
              <label htmlFor="password">Password</label>
              <input type="password" name="password" placeholder="password" />
            </div>
          </div>
        </div>
        <div className="footer">
          <button type="button" className="btn">
            Login
          </button>
          
        </div>
      </div>
    );
  }
}