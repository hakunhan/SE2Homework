import axios from 'axios'

const DRUG_REST_API_URL = 'http://localhost:8090/api/drug';

class DrugService{
    getDrugs(){
        return axios.get(DRUG_REST_API_URL);
    }
}

export default new DrugService();