import axios from 'axios'

const PATIENT_REST_API_URL = 'http://localhost:8090/api/patient';

class PatientService{
    getPatients(){
        return axios.get(PATIENT_REST_API_URL);
    }
}

export default new PatientService();