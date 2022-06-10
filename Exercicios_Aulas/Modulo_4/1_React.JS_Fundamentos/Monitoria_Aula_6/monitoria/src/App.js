import './App.css';
import AppLista from './components/AppLista';

import { Provider } from 'react-redux';
import store from './store';

function App() {
  return (
    <div className="App">
      <Provider store={store}>
        <AppLista />
      </Provider>
    </div>
  );
}

export default App;
