/*      Copyright 2022 Mohammad Faisal Khatri

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package Test;

import lombok.Data;


@Data
public class AuthenticationPojo {
    private  String LanguageCode;
    private String EmailOrPhone;
    private String Password;
    private String AuthenticationCode;
    private String SmsMobileKey;



    /**
     *
     *
     * @param EmailOrPhone
     * @param LanguageCode
     * @param Password
     * @param AuthenticationCode
     * @param SmsMobileKey
     */
    public AuthenticationPojo(String EmailOrPhone, String LanguageCode,String Password,String AuthenticationCode,String SmsMobileKey) {
        this.LanguageCode=LanguageCode;
        this.EmailOrPhone = EmailOrPhone;
        this.Password = Password;
        this.AuthenticationCode=AuthenticationCode;
        this.SmsMobileKey=SmsMobileKey;
    }

}