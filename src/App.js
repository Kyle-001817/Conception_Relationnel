import './App.css';
import AppHeader from './components/AppHeader';
import Statistics from './components/Statistics';

function App() {
  return (
    <div className="App">
      <header className="App-header">
          <AppHeader />
          <Statistics />
      </header>
    </div>
  );
}

export default App;
