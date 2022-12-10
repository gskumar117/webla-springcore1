import React, { Component } from 'react';
import './App.css';
import { Routes ,Route } from 'react-router-dom';
import FindPatients from './components/FindPatients';
import DisplayPatients from './components/DisplayPatients';
import CollectClinicals from './components/CollectClinicals';
import AddPatient from './components/AddPatient';
import AnalyzeData from './components/AnalyzeData';
import Home from './components/Home';
import ChartGenerator from './components/ChartGenerator';

class App extends Component {
  render() {
    return (
      <div className="App">
       <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/findPatients" element={<FindPatients/>}/>
        <Route exact path="/displayPatients/:firstName/:lastName" element={<DisplayPatients/>}/>
        <Route exact path="/patientDetails/:id" element={<CollectClinicals/>}/>
        <Route exact path="/addPatient" element={<AddPatient/>}/>
        <Route exact path="/analyze/:id1" element={<AnalyzeData/>}/>
        <Route exact path="/chart/:componentName/:id2" element={<ChartGenerator/>}/>
       </Routes>
      </div>
    );
  }
}

export default App;
