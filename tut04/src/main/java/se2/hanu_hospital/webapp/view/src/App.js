import logo from './logo.svg';
import './App.css';
import MedicalRecordComponent from './components/MedicalRecordComponent';
import DrugComponent from './components/DrugComponent';
import PatientComponent from './components/PatientComponent';

function App() {
  return (
    <div className="App">
      <MedicalRecordComponent />
      <DrugComponent />
      <PatientComponent />
    </div>
  );
}

export default App;
