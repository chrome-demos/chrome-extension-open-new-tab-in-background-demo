package example

import chrome.tabs.CreateProperties
import kotlinjs.common.jsonAs

fun main(args: Array<String>) {
    chrome.tabs.create(jsonAs<CreateProperties>().apply {
        url = "http://github.com"
        active = false
    }) { tab ->
        console.log("Opened tab in background: ${tab.id}")
    }
}
