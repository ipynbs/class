from flask import Flask, render_template, request
from components import fileboard
from components import freeboard
from sklearn.linear_model import LinearRegression

app = Flask(__name__)

app.register_blueprint(freeboard.app)
app.register_blueprint(fileboard.app)


@app.route("/")
def index():

    return render_template('index.html')


app.run(debug=True)
