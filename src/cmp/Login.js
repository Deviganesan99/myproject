import React,{ Component } from 'react';
import {Link,NavLink}from "react-router-dom";
import './Login.css';

class Login extends React.Component{
    constructor(){
        super();
        this.state={
            data:false
        }
    }
    componentDidMount()
    {
        let url="http://localhost:8080/api/v1/patient";
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
  <p>Covid-19 (Coronavirus) has hit all areas not only of the India but the World in many different ways, we have joined forces with a number of other Voluntary Organisations to try and build a community response to this virus. We are building a database of volunteers who are willing to help in their communities, this can include, telephone conversations with those who are isolated, shopping, co-ordinating volunteers and those in need, and just building a stronger community moving forward. We are also wanting anyone who is struggling with Covid-19 across Tamilnadu to get in touch, and we will help in any way that we can. We are able to help in a number of ways, so for anyone who has any queries in the TN area please get in touch primarily with ourselves on +91 8989877766. </p>
  <img src="-webkit-user-select: none;margin: auto;" src="https://assets.weforum.org/article/image/large__WMvjmt1qb1f_BmoCt6DDIS8aZM-VZDF_jUxWE1mgGw.JPG" width="500" height="200"></img>
</div>

<header>


<li><NavLink exact to ="/">Home</NavLink></li>
</header>
</div>

  </div>

 
           
            
        );
    }
};
export default Login;