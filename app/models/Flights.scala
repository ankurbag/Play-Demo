package models

import play.api.libs.json._

case class Flights(id: Long, source: String, destination: String, carrier: String, dateOfTravel: String, dateOfPriceFall:String, predictedPrice: Int, latitude: String, longitude: String, distance: String, seats: Int)

object Flights {
  
  implicit val flightFormat = Json.format[Flights]
}
