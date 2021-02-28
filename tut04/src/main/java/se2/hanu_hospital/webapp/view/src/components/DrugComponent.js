import React from 'react';
import DrugService from '../services/DrugService';

class DrugComponent extends React.Component{
    
    constructor(props){
        super(props);
        this.state = {
            Drugs:[]
        }
    }

    componentDidMount(){
        DrugService.getDrugs().then((response) => {
            this.setState({ Drugs: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center">Drug List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Price</td>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.Drugs.map(
                                Drug =>
                                <tr key = {Drug.id}>
                                    <td> {Drug.id}</td>
                                    <td> {Drug.drugName}</td>
                                    <td> {Drug.drugPrice}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }

}

export default DrugComponent
