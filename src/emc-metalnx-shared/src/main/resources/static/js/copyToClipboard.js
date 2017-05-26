/*
 *    Copyright (c) 2015-2017 Dell EMC
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

function setCopyTicketBtn(){
    var copyTicketBtn = document.querySelector('.copyTicketBtn');
    copyTicketBtn.addEventListener('click', function(event) {
        var ticketInfo = document.querySelector('#newTicketInfoCopy');
        var range = document.createRange();
        range.selectNode(ticketInfo);
        window.getSelection().addRange(range);
        document.execCommand('copy');
        window.getSelection().removeAllRanges();
    });
}