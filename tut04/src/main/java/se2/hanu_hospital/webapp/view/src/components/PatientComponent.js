import React from 'react';
import PatientService from '../services/PatientService';

class PatientComponent extends React.Component{
    
    constructor(props){
        super(props);
        this.state = {
            Patients:[]
        }
    }

    componentDidMount(){
        PatientService.getPatients().then((response) => {
            this.setState({ Patients: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center">Patient List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Phone Number</td>
                            <td>Address</td>
                            <td>Blood Type</td>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.Patients.map(
                                Patient =>
                                <tr key = {Patient.id}>
                                    <td> {Patient.id}</td>
                                    <td> {Patient.name}</td>
                                    <td> {Patient.phoneNumber}</td>
                                    <td> {Patient.address}</td>
                                    <td> {Patient.bloodType}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }

}

export default PatientComponent
