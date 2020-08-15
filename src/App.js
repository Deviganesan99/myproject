import React from 'react';
import Home from'./cmp/Home';
import './App.css';
import Login from'./cmp/Login';
import Patient from'./cmp/Patient';
import Store from'./cmp/Store';
import PatientDetails from'./cmp/PatientDetails';
import VolunteerDetails from'./cmp/VolunteerDetails';
import StoreDetails from'./cmp/StoreDetails';
import Volunteer from'./cmp/Volunteer';

import App1 from './components/login/App1';

import {
	BrowserRouter as Router,
	Switch,
	Route,
	Link
  } from "react-router-dom";
function App() {
  return (
    <div>
      <Router>
      <switch>
        <Route exact path="/login"><Login/></Route>
        <Route exact path="/patient"><Patient/></Route>
        <Route exact path="/store"><Store/></Route>
        <Route exact path="/volunteer"><Volunteer/></Route>
        <Route exact path="/register"><App1/></Route>
        <Route exact path="/"><Home/></Route>
        <Route exact path="/patientdetails"><PatientDetails/></Route>
        <Route exact path="/volunteerdetails"><VolunteerDetails/></Route>
        <Route exact path="/storedetails"><StoreDetails/></Route>
      </switch>
      </Router>

    </div>
    
  );
}



export default App;
