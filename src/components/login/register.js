import React from "react";
import {Link,NavLink}from "react-router-dom";
import loginImg from "./login.svg";
import "./style.css";
import "./App.scss";
export class Register extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div className="base-container" ref={this.props.containerRef}>
        <div className="header">Register</div>
        <li><NavLink exact to ="/">Home</NavLink></li>
        <div className="content">
          <div className="image">
          <img src="https://static.mygov.in/rest/s3fs-public/mygov_158538832155063671.jpg"  width="300" height="200"></img>

          </div>
          <div className="form">
            <div className="form-group">
            <div className="form-group">
              <label htmlFor="UserId">UserId</label>
              <input type="text" name="UserId" placeholder="UserId" />
            </div>
              <label htmlFor="username">Username</label>
              <input type="text" name="username" placeholder="username" />
            </div>
            <div className="form-group">
              <label htmlFor="phonenumber">Email</label>
              <input type="text" name="phonenumber" placeholder="phonenumer" />
            </div>
            <div className="form-group">
              <label htmlFor="password">Password</label>
              <input type="text" name="password" placeholder="password" />
            </div>
            
          </div>
        </div>
        <div className="footer">
          <button type="button" className="btn">
            Register
          </button>
        </div>
      </div>
    );
  }
}