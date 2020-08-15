import React,{ Component } from 'react';
import {Link,NavLink}from "react-router-dom";
import './home.css';
import Login from'./Login';
import Patient from'./Patient';
import Store from'./Store';
import Volunteer from'./Volunteer';

  
	
  class Home extends React.Component {
	
  

    render(){
        return (
            
      <div>
            <head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="style.css"></link>
		 <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700%7CPT+Serif:400,700,400italic' rel='stylesheet'></link>
		  <link href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans" rel="stylesheet"></link>
</head>
<body>

	<div class="bgimage">
		<div class="menu">
			
			<div class="leftmenu">
			<img src="https://s3.amazonaws.com/odc-designs/logos/thumb/93044-3563.png"  width="150" height="100"></img>
			
			</div>

			<div class="rightmenu">
				<ul>
					<li id="fisrtlist"> HOME </li>
					
            <li><NavLink exact to ="/login">About</NavLink></li>
			<li><NavLink exact to ="/patient">Patient</NavLink></li>
			<li><NavLink exact to ="/store">Store</NavLink></li>
			<li><NavLink exact to ="/register">Volunteer</NavLink></li>
		

					
				</ul>
			</div>

		</div>

		<div class="text">
		<h1 class ="text1">QUAR ON TIME</h1>
			<h2> HELP & CARES </h2>
			<h3> STAY AT HOME QUARANTINE TO STOP CORONA VIRUS </h3>
			
			<button id="buttonone"> likes </button>
			<button id="buttontwo"> Reviews </button> 
		</div>

	</div>


</body>
     
      </div>  
        );
    }
};
export default Home;