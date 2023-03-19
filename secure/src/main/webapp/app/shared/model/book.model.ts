import { IAuthor } from 'app/shared/model/author.model';

export interface IBook {
  id?: number;
  isbn?: string;
  name?: string;
  publishYear?: string | null;
  coverContentType?: string | null;
  cover?: string | null;
  authors?: IAuthor[] | null;
}

export const defaultValue: Readonly<IBook> = {};
