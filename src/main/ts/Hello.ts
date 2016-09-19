import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import {Greeter} from "./Greeter";
var greeter = new Greeter("world");
alert(greeter);