import { suma, multiplica } from './controller.js';
import chalk from 'chalk';

const sum = suma(1, 2);
console.log(sum);

const multiplic = multiplica(4, 5);
console.log(chalk.green(multiplic));