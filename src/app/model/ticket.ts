import {Fields} from './fields';

export class Ticket {

  id: bigint;
  key: string;
  self: string;
  expand: string;
  fields: Fields;
}
