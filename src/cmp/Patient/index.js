import React,{ Component } from 'react';
import {Link,NavLink}from "react-router-dom";
import './style.css';

class Patient extends Component{
   
    render(){
        return (
        <div>    
      
  <head>
      
    <meta charset="utf-8"></meta>
    <title></title>
    <link rel="stylesheet" href="style.css"></link>
  </head>
  <body>
<div class="login-box">
  <h1>Login</h1>
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" placeholder="Username"></input>
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" placeholder="Password"></input>
  </div>

  <input type="button" class="btn" value="Sign in"></input>
  <li><NavLink exact to ="/patientdetails">PatientDetails</NavLink></li>
  <li><NavLink exact to ="/">Home</NavLink></li>
  
  </div>
  </body>


   
  </div>

 
           
            
        );
    }
};
export default Patient;