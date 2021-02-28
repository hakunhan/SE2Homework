import React from 'react';
import MedicalRecordService from '../services/MedicalRecordService';

class MedicalRecordComponent extends React.Component{
    
    constructor(props){
        super(props);
        this.state = {
            medicalRecords:[]
        }
    }

    componentDidMount(){
        MedicalRecordService.getMedicalRecords().then((response) => {
            this.setState({ medicalRecords: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center">Medical Record List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>Patients Name</td>
                            <td>Disease</td>
                            <td>Drug List ID</td>
                            <td>Treatment Note</td>
                            <td>Treatment Date</td>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.medicalRecords.map(
                                medicalRecord =>
                                <tr key = {medicalRecord.id}>
                                    <td> {medicalRecord.patient.name}</td>
                                    <td> {medicalRecord.disease}</td>
                                    <td> {medicalRecord.drugList.id}</td>
                                    <td> {medicalRecord.treatmentNote}</td>
                                    <td> {medicalRecord.treatmentDate}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }

}

export default MedicalRecordComponent