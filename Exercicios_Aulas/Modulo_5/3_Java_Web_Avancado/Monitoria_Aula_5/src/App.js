import './App.css';
import Count from './components/Count';
import Mirror from './components/Mirror';
import ContadorProvider from './context/Contador';

function App() {
  return (
    <div className="App">
      <ContadorProvider>
        <Count />
        <hr />
        <Mirror />
      </ContadorProvider>
    </div>
  );
}

export default App;
