/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package pt.lighthouselabs.obd.commands.protocol;

/**
 * This command will turn-off echo.
 */
public class EchoOffObdCommand extends ObdProtocolCommand {

	public EchoOffObdCommand() {
		super("AT E0");
	}

	/**
         * <p>Constructor for EchoOffObdCommand.</p>
         *
         * @param other a {@link pt.lighthouselabs.obd.commands.protocol.EchoOffObdCommand} object.
	 */
	public EchoOffObdCommand(EchoOffObdCommand other) {
		super(other);
	}
	
	@Override
	public String getFormattedResult() {
		return getResult();
	}

	@Override
	public String getName() {
		return "Echo Off";
	}

}