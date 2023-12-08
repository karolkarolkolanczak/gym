import { useNavigate } from 'react-router-dom';

const HomePageLoggedOut = ({ handleLoginChange }) => {
    const navigate = useNavigate();

    return (
        <div className="content">
            <h1 className="BorderedRubik">Welcome to our training and fitness app!</h1>
            <p>Click the button below to get started</p>
            <div className="MainButtonContainer">
                <button id="GetStartedButton" className="MainButton" type="button" onClick={() => navigate("/register")}>
                    LET'S GET STARTED
                </button>
            </div>
        </div>
    );
};

export default HomePageLoggedOut;