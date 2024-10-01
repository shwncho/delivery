package com.delivery.websocketclient.handler

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseMessage(@JsonProperty("content") val content: String) {
}