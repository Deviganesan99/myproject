import React,{ Component } from 'react';
import {Link,NavLink}from "react-router-dom";
import './Login.css';

class Store extends React.Component{
    
    
    render(){
        
        return (
        
        <div>
            
        <div className="loginpage">

			<img src="https://s3.amazonaws.com/odc-designs/logos/thumb/93044-3563.png" width="200" height="100"></img>
        
        <div class="about-section">
    
        <h2>Shops&Facilities </h2>
<h4>Unforutnately all shops are still shut due to the Covid-19 pandemic.But some of the shops are coordinating with us to cross the situation and will help the people to keep hygine. We will keep the website up to date as much as possible.  

We do, however, have a drop-off donation station at our Website so people eho are will give their valuable can contact us from 10.30 - 04.00. </h4>
<p>The following shops are coordinating with us.</p>

<div class="row">
  <div class="column">
  <img src="https://etimg.etb2bimg.com/thumb/msid-68516283,width-1200,resizemode-4/.jpg"  width="200" height="200"></img>
    <p>Valuemart Wholesale Price Supermarket, HIG-1-104,NOLAMBUR MAIN ROAD,MOGAPPAIR WEST, Chennai, Tamil Nadu 600037</p>
  </div>
  <div class="column">
  <img src="https://content3.jdmagicbox.com/comp/bangalore/66/080p5163666/catalogue/model-medical-stores-bangalore-dt5wi531ur.jpg"  width="300" height="200"></img>    <p>MedPlus Ambattur - Athipet, No 11, Ambattur Rd, Kalaivanar Nagar, KK Nagar, Ambattur, Chennai, Tamil Nadu 600106</p>
  </div>
  <div class="column">
  <img src="-webkit-user-select: none;margin: auto;" src="https://5.imimg.com/data5/TC/GX/MY-1010080/vegetable-shops-billing-software-500x500.jpg" width="300" height="200"></img>

    <p>vegvillage.in | selling fruits and vegetables, Aani St,Natesa Nagar, Virugambakkam, Chennai, Tamil Nadu 600092</p>
    
  </div>
  </div>
</div>
<header>
<li><NavLink exact to ="/storedetails">StoreDetails</NavLink></li>

<li><NavLink exact to ="/">Home</NavLink></li>
</header>
</div>

  </div>

 
           
            
        );
    }
};
export default Store;