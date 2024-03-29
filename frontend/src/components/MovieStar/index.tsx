import {ReactComponent as StarFull} from 'assets/img/Star-Full.svg';
import {ReactComponent as StarHalf} from 'assets/img/Star-Half.svg';
import {ReactComponent as StarEmpty} from 'assets/img/Star-Empty.svg';
import './style.css';
function MovieStar() {
    return (
        <div className="dsmovie-stars-container">
            <StarFull />
            <StarFull />
            <StarFull />
            <StarHalf />
            <StarEmpty />
        </div>
    );
}

export default MovieStar;