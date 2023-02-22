// import logo from './logo.svg';
import { Link, Route, Routes } from 'react-router-dom';
import './App.css';
import About from './components/About.js';
import Counter from './components/Counter.js';
import Home from './components/Home.js';
import Sum from './components/Sum.js';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>MYPAGE</h1>

        <nav>
          <Link className='App-link' to='/'>home</Link>
          <Link className='App-link' to='/about'>About</Link>
          <Link className='App-link' to='/counter'>Counter</Link>
          <Link className='App-link' to='/sum'>Sum</Link>
        </nav>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/about' element={<About/>}/>
          <Route path='/counter' element={<Counter/>}/>
          <Route path='/sum' element={<Sum/>}/>
        </Routes>
        {/* <Home/> */}
        {/* <About/> */}
        {/* <Counter/> */}
        {/* <Sum/> */}
        {/* <img src={logo} className="App-logo" alt="logo" />
        <p>
          안녕하세요 react 입니다
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> */}
      </header>
    </div>
  );
}

export default App;
