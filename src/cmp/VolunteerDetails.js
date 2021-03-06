import React,{ Component } from 'react';
import {Link,NavLink}from "react-router-dom";
import './Login.css';

class VolunteerDetails extends React.Component{
    constructor(){
        super();
        this.state={
            data:false
        }
    }
    componentDidMount()
    {
        let url="http://localhost:8080/api/v1/volunteer/1";
        fetch(url,{
            method:'GET',
            headers:{
            "Access-Control-Allow-Origin":"*",
        "Access-Control-Allow-Origin-Credential":"true"   
            }
        }).then((result)=>{
            result.json().then((resp)=>{
                this.setState({data:resp})
            })
        })
    }
    render(){
        const data=this.state.data;
        console.warn(data);
        return (
        
        <div>
            
        <div className="loginpage">
        <img src="https://s3.amazonaws.com/odc-designs/logos/thumb/93044-3563.png"  width="150" height="100"></img>

        <div class="about-section">
        <p classNmae="title1">
  <h1 classNmame="text">QUAR ON TIME</h1></p>
  </div>
{
    data?
<div>
    
    <p>VolunteerId: {data.id} ,</p>
    <p> Volunteer  Name: {data.firstName},</p>
    <p>Volunteer Address: {data.address},</p>
    <p>Volunteer  Email: {data.emailId},</p>
    <p> Volunteer Phone Number: {data.phone}</p>
</div>
    
    :<p>please wait</p>
}
<header>


<li><NavLink exact to ="/">Home</NavLink></li>
</header>
</div>

  </div>

 
           
            
        );
    }
};
export default VolunteerDetails;