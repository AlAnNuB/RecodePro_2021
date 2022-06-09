import { bindActionCreators } from 'redux'
import './App.css';
import React from 'react';
import { connect } from 'react-redux'
import { clickButton } from './actions';

class App extends React.Component {
  state = {
    input: ''
  }

  inputChange = event => {
    this.setState({
      input: event.target.value
    })
  }

  render() {
    const { newValue, clickButton } = this.props
    return (
      <div className="App" style={{ paddingTop: '10px' }}>

        <h2>App: React com Redux</h2>

        <input type='text' onChange={this.inputChange} />

        <button onClick={() => clickButton(this.state.input)}>

          Enviar

        </button>

        <h3>{newValue}</h3>

      </div>
    )
  }
}

const mapStateToProps = store => ({
  newValue: store.clickState.newValue
})

const mapDispatchToProps = dispatch => bindActionCreators({ clickButton }, dispatch)

export default connect(mapStateToProps, mapDispatchToProps)(App);
