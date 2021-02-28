import axios from 'axios'

const MEDICAL_RECORD_REST_API_URL = 'http://localhost:8090/api/medical_record';

class MedicalRecordService{
    getMedicalRecords(){
        return axios.get(MEDICAL_RECORD_REST_API_URL);
    }
}

export default new MedicalRecordService();