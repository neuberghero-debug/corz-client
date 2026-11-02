package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;

public final class IIIIIillIIIIil {
   public static final int lillillIiiillillIi = 1;
   private static final int iIilillIiIlilillIi = 16;
   private static final long llilillIiililillIi = 253402300799999L;
   public static final int IIilillIilIilillIi = 16384;

   private static String Iiilliiliiil(String arm, String context) {
      return arm + '\n' + context;
   }

   private static boolean IIillIiliIil(String text) {
      return text != null && text.getBytes(StandardCharsets.UTF_8).length <= 16384;
   }

   private static lliiliiliili IIIllIIliIIl(JsonObject o) {
      lliilIlliliilIll var1 = new lliilIlliliilIll();
      if (o == null) {
         return var1.IlIillIiilIi();
      } else {
         var1.IiIiliIiiiIi(
            new lliiliiliili(
               IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","nkcFt3kQGZg8ynRAQW2SuMykgP1iKwZqU9JcQ+9coW6QUxxri6zIBqk=">())), 2),
               IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","00zVlU1C93lc0rHpOO+nxob24XnOfmR1u3Hf2ToE7NKI49Ro">())), 2),
               IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","R9xUHVK4tt/0ritBGu1BH+/zxdsf6I7UX8buhBP3xpJ+mHJ/">())), 4),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","BbGbiGqPCl5w15sGkpbud5gCiYo6FjwglhMMOSNgwF/IsZII">()), 0.0),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","NAeiz936B7ODwS4uZV+xz7Ckz+lvb4WjVur2a6Sz/2eThys=">()), 8.0),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","EREGBTHy01gIDfAJcspcbsJUN7kI9QpgYZGfsIkkgto=">()), 12.0),
               IIlilIliiIli(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","BQCI3FT/iwICCd281fOiUMo3EUXeEvMclR77VTKiy1z79+iZQQ==">())), 2)
            )
         );
         return var1.IlIillIiilIi();
      }
   }

   private static Set<String> Ililllililil(List<lliililliliilill> refs, int k) {
      long var6 = 562712271416770622L;
      HashSet var2 = new HashSet();
      Iterator var3 = refs.iterator();

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < k && var3.hasNext(); var8 += 4294967296L) {
         lliililliliilill var5 = (lliililliliilill)var3.next();
         var2.add(Iiilliiliiil(var5.IliIlllilIi(), var5.liiiIIllIl()));
      }

      return var2;
   }

   private static String Illlllllilll(String name) {
      long var4 = -135921877717161089L;
      if (name == null) {
         return "";
      } else {
         String var1 = name.toLowerCase(Locale.ROOT);
         if (var1.length() > 16) {
            return "";
         } else {
            var4 ^= (0L ^ var4) & -1L << 32;

            while ((int)(var4 >>> 32) < var1.length()) {
               var4 ^= ((long)var1.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
               if (((int)var4 < 97 || (int)var4 > 122) && ((int)var4 < 48 || (int)var4 > 57) && (int)var4 != 95) {
                  return "";
               }

               var4 += 4294967296L;
            }

            return var1;
         }
      }
   }

   private static double IIlllIlliIll(double mean, lIlIIliIlIIl arm, String f) {
      return IiIIIlliIIIl.Iliilliiilii(mean, -1.0, 1.0, iliilIIlIiiilIIl.liiiIIllIl(arm, f));
   }

   private static double[] IiIiliIiiiIi(JsonArray size, int fallback, double a) {
      long var6 = 4863474438567769819L;
      double[] var4 = new double[fallback];

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < fallback; var8 += 4294967296L) {
         var4[(int)(var8 >>> 32)] = size != null && (int)(var8 >>> 32) < size.size() ? Iilililiiili(size.get((int)(var8 >>> 32)), a) : a;
      }

      return var4;
   }

   private static JsonArray Iiiiliiiiiii(JsonElement e) {
      return e != null && e.isJsonArray() ? e.getAsJsonArray() : null;
   }

   private static String Iilllilliill(String uuid) {
      if (uuid != null && !uuid.isEmpty() && uuid.length() <= 36) {
         try {
            return UUID.fromString(uuid).toString();
         } catch (IllegalArgumentException var2) {
            return "";
         }
      } else {
         return "";
      }
   }

   private static Map<String, double[]> IilliliilIIi(String key, Map<String, double[]> arms) {
      long var10 = 6156594003986140023L;
      if (key != null && arms != null) {
         var10 ^= ((long)key.indexOf(124) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) < 0) {
            return null;
         } else {
            lIlIIliIlIIl var3 = iliilIIlIiiilIIl.Illlllllilll(key.substring(0, (int)(var10 >>> 32)));
            if (var3 != null && iliilIIlIiiilIIl.IilliliilIIi(key.substring((int)(var10 >>> 32) + 1))) {
               List var4 = iliilIIlIiiilIIl.IliIlllilIi(var3);
               LinkedHashMap var5 = new LinkedHashMap();

               for (Entry var7 : arms.entrySet()) {
                  String var8 = (String)var7.getKey();
                  double[] var9 = (double[])var7.getValue();
                  if (var8 != null && var9 != null && var9.length >= 2 && var4.contains(var8) && !var5.containsKey(var8)) {
                     if (var5.size() >= 8) {
                        break;
                     }

                     var5.put(var8, new double[]{IiIlliIliiIl(var9[0]), IIlllIlliIll(var9[1], var3, var8)});
                  }
               }

               return var5.isEmpty() ? null : var5;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static String lIiiIiIlilli(ililllilIiilllil s, Set<String> dropped) {
      JsonObject var2 = new JsonObject();
      var2.addProperty(iIIIlIlIIl<"iIIIlIlIIl","BMqmUTGJlpAF0A2Duz9CZ8xXnk0kCiEK5sZxFEE=">(), 1);
      var2.addProperty(iIIIlIlIIl<"iIIIlIlIIl","RhMq1M79GdjGdXma51g6i3PbMgUyfuJ/HIpbIQ4/dGE=">(), s.IilliliilIIi());
      var2.addProperty(iIIIlIlIIl<"iIIIlIlIIl","EiTmX7gdFdgFchDhi1/CNlXdE97ZQpftCgqJZBjuxQw=">(), s.lIiiIiIlilli());
      var2.addProperty(iIIIlIlIIl<"iIIIlIlIIl","Tfx1JIBfOcV9UPblP38HjUSox0VVo7n7eRRDBlAgJgZNiM8=">(), s.iliIiiliiiii());
      var2.addProperty(iIIIlIlIIl<"iIIIlIlIIl","+bq5XZVt++QFGuxhaeOPCaJoSi+1389FuRQSkbUYUdtYnQ==">(), s.IIIllIIliIIl());
      JsonObject var3 = new JsonObject();
      var3.add(iIIIlIlIIl<"iIIIlIlIIl","NWdPvedQT57Bd0lmJ6FxqZCCNgD9A/D6PaUhkptShmFl">(), IIIilIIiiIIi(s.IlIlllIlilIl().IliIlllilIi()));
      var3.add(iIIIlIlIIl<"iIIIlIlIIl","ib2OCkXCiLdjktSbHST49Gh/JxSLSzPGOpoC3WORCaLYSxM=">(), IIIilIIiiIIi(s.IlIlllIlilIl().liiiIIllIl()));
      var3.addProperty(iIIIlIlIIl<"iIIIlIlIIl","+y8gkeOrNZvtptNoAZgdVTwKMjZiStsA3zzFGLa1f+Y8">(), s.IlIlllIlilIl().iIlIlllllill());
      var3.addProperty(iIIIlIlIIl<"iIIIlIlIIl","QYCtXwXl+tmeoNXTalL7jtVvQPqoHTQ0hq68J9a5ymrY">(), s.IlIlllIlilIl().IilliliilIIi());
      var3.addProperty(iIIIlIlIIl<"iIIIlIlIIl","jMhyDhVOIG2sZ2V7itJ/+j6I3LPeBsjULLIGi2zN5wc=">(), s.IlIlllIlilIl().lIiiIiIlilli());
      var3.addProperty(iIIIlIlIIl<"iIIIlIlIIl","VLKCApDacxCu7J/HZfhoWJhUN5sYHMGu2yMfcobNZg==">(), s.IlIlllIlilIl().iliIiiliiiii());
      var3.addProperty(iIIIlIlIIl<"iIIIlIlIIl","kfDyhZ+ySbkp/5oq9T482cVeT1Tgxlrowykgvs0=">(), s.IlIlllIlilIl().IIIllIIliIIl());
      var2.add(iIIIlIlIIl<"iIIIlIlIIl","BSiC41SXamXmP34wDfk7sbChJ3C3CbTV2rY4Ob7PUQ==">(), var3);
      JsonObject var4 = new JsonObject();
      var4.add(iIIIlIlIIl<"iIIIlIlIIl","nkcFt3kQGZg8ynRAQW2SuMykgP1iKwZqU9JcQ+9coW6QUxxri6zIBqk=">(), IlIillIiilIi(s.IiIlliIliiIl().IliIlllilIi()));
      var4.add(iIIIlIlIIl<"iIIIlIlIIl","00zVlU1C93lc0rHpOO+nxob24XnOfmR1u3Hf2ToE7NKI49Ro">(), IlIillIiilIi(s.IiIlliIliiIl().liiiIIllIl()));
      var4.add(iIIIlIlIIl<"iIIIlIlIIl","R9xUHVK4tt/0ritBGu1BH+/zxdsf6I7UX8buhBP3xpJ+mHJ/">(), IlIillIiilIi(s.IiIlliIliiIl().iIlIlllllill()));
      var4.addProperty(iIIIlIlIIl<"iIIIlIlIIl","BbGbiGqPCl5w15sGkpbud5gCiYo6FjwglhMMOSNgwF/IsZII">(), s.IiIlliIliiIl().IilliliilIIi());
      var4.addProperty(iIIIlIlIIl<"iIIIlIlIIl","NAeiz936B7ODwS4uZV+xz7Ckz+lvb4WjVur2a6Sz/2eThys=">(), s.IiIlliIliiIl().lIiiIiIlilli());
      var4.addProperty(iIIIlIlIIl<"iIIIlIlIIl","EREGBTHy01gIDfAJcspcbsJUN7kI9QpgYZGfsIkkgto=">(), s.IiIlliIliiIl().iliIiiliiiii());
      var4.add(iIIIlIlIIl<"iIIIlIlIIl","BQCI3FT/iwICCd281fOiUMo3EUXeEvMclR77VTKiy1z79+iZQQ==">(), IlIillIiilIi(s.IiIlliIliiIl().IIIllIIliIIl()));
      var2.add(iIIIlIlIIl<"iIIIlIlIIl","4QApsaW0UMyP07za0QX7uE18mNZM737SGdBprBdyNIKd+w==">(), var4);
      JsonObject var5 = new JsonObject();

      for (Entry var7 : s.IIlllIlliIll().entrySet()) {
         JsonObject var8 = new JsonObject();

         for (Entry var10 : ((Map)var7.getValue()).entrySet()) {
            if (!dropped.contains(Iiilliiliiil((String)var7.getKey(), (String)var10.getKey()))) {
               JsonArray var11 = new JsonArray();
               var11.add(new JsonPrimitive(((double[])var10.getValue())[0]));
               var11.add(new JsonPrimitive(((double[])var10.getValue())[1]));
               var8.add((String)var10.getKey(), var11);
            }
         }

         if (var8.size() > 0) {
            var5.add((String)var7.getKey(), var8);
         }
      }

      var2.add(iIIIlIlIIl<"iIIIlIlIIl","8VDfz6s5Xsf65PbOa7eC5KAfPvqpERQuhNXCuebT51M=">(), var5);
      var2.add(iIIIlIlIIl<"iIIIlIlIIl","xI9ELdz5U7yZGiC8e+wSOnyjXCNKgDVdfH7t1jIzhxKL">(), IlIillIiilIi(s.Illlllllilll()));
      return var2.toString();
   }

   private static Map<String, Map<String, double[]>> IlIlllIlilIl(JsonObject o) {
      LinkedHashMap var1 = new LinkedHashMap();
      if (o == null) {
         return var1;
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (Entry var4 : o.entrySet()) {
            JsonObject var5 = Iliilliiilii((JsonElement)var4.getValue());
            if (var5 != null) {
               LinkedHashMap var6 = new LinkedHashMap();

               for (Entry var8 : var5.entrySet()) {
                  JsonArray var9 = Iiiiliiiiiii((JsonElement)var8.getValue());
                  if (var9 != null && var9.size() >= 2) {
                     var6.put((String)var8.getKey(), new double[]{Iilililiiili(var9.get(0), 0.0), Iilililiiili(var9.get(1), Double.NaN)});
                  }
               }

               Map var10 = IilliliilIIi((String)var4.getKey(), var6);
               if (var10 != null) {
                  lIlIIliIlIIl var11 = iliilIIlIiiilIIl.Illlllllilll(((String)var4.getKey()).substring(0, ((String)var4.getKey()).indexOf(124)));
                  List var12 = var2.computeIfAbsent(var11, k -> new ArrayList());
                  if (var1.remove(var4.getKey()) != null) {
                     var12.remove(var4.getKey());
                  }

                  var1.put((String)var4.getKey(), var10);
                  var12.add((String)var4.getKey());

                  while (var12.size() > 16) {
                     var1.remove(var12.remove(0));
                  }
               }
            }
         }

         return var1;
      }
   }

   private static double Iilililiiili(JsonElement e, double fallback) {
      if (e != null && e.isJsonPrimitive()) {
         JsonPrimitive var3 = e.getAsJsonPrimitive();
         if (!var3.isNumber()) {
            return fallback;
         } else {
            try {
               return var3.getAsDouble();
            } catch (RuntimeException var5) {
               return fallback;
            }
         }
      } else {
         return fallback;
      }
   }

   private static double IiIlliIliiIl(double n) {
      return Double.isNaN(n) ? 0.0 : IiIIIlliIIIl.IIiilIiiiIii(n, 0.0, 1000000.0);
   }

   private static int[] IIlilIliiIli(JsonArray size, int a) {
      long var4 = 8819716146248810513L;
      int[] var2 = new int[a];

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < a; var6 += 4294967296L) {
         var2[(int)(var6 >>> 32)] = size != null && (int)(var6 >>> 32) < size.size() ? Illillliilli(Iilililiiili(size.get((int)(var6 >>> 32)), 0.0)) : 0;
      }

      return var2;
   }

   public static ililllilIiilllil liiiIIllIl(String json) {
      long var11 = 2724303257607750913L;
      if (json != null && json.length() <= 16384) {
         JsonObject var1;
         try {
            JsonElement var2 = JsonParser.parseString(json);
            if (var2 == null || !var2.isJsonObject()) {
               return null;
            }

            var1 = var2.getAsJsonObject();
         } catch (StackOverflowError | RuntimeException var14) {
            return null;
         }

         try {
            if (Iilililiiili(var1.get(iIIIlIlIIl<"iIIIlIlIIl","BMqmUTGJlpAF0A2Duz9CZ8xXnk0kCiEK5sZxFEE=">()), Double.NaN) != 1.0) {
               return null;
            } else {
               String var15 = Illlllllilll(IIiilIiiiIii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","RhMq1M79GdjGdXma51g6i3PbMgUyfuJ/HIpbIQ4/dGE=">())));
               String var3 = Iilllilliill(IIiilIiiiIii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","EiTmX7gdFdgFchDhi1/CNlXdE97ZQpftCgqJZBjuxQw=">())));
               long var4 = (long)IiIIIlliIIIl.Iliilliiilii(
                  Iilililiiili(var1.get(iIIIlIlIIl<"iIIIlIlIIl","Tfx1JIBfOcV9UPblP38HjUSox0VVo7n7eRRDBlAgJgZNiM8=">()), 0.0), 0.0, 2.53402300799999E14, 0.0
               );
               var11 ^= (
                     (long)Illillliilli(Iilililiiili(var1.get(iIIIlIlIIl<"iIIIlIlIIl","+bq5XZVt++QFGuxhaeOPCaJoSi+1389FuRQSkbUYUdtYnQ==">()), 0.0)) << 32
                        ^ var11
                  )
                  & -1L << 32;
               iilIlIilIIiIlIil var7 = iliIiiliiiii(Iliilliiilii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","BSiC41SXamXmP34wDfk7sbChJ3C3CbTV2rY4Ob7PUQ==">())));
               lliiliiliili var8 = IIIllIIliIIl(Iliilliiilii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","4QApsaW0UMyP07za0QX7uE18mNZM737SGdBprBdyNIKd+w==">())));
               Map var9 = IlIlllIlilIl(Iliilliiilii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","8VDfz6s5Xsf65PbOa7eC5KAfPvqpERQuhNXCuebT51M=">())));
               int[] var10 = lillililiillilil.liiiIIllIl(
                     IIlilIliiIli(Iiiiliiiiiii(var1.get(iIIIlIlIIl<"iIIIlIlIIl","xI9ELdz5U7yZGiC8e+wSOnyjXCNKgDVdfH7t1jIzhxKL">())), 6)
                  )
                  .IliIlllilIi();
               return new ililllilIiilllil(1, var15, var3, var4, (int)(var11 >>> 32), var7, var8, var9, var10);
            }
         } catch (RuntimeException var13) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String IIiilIiiiIii(JsonElement e) {
      return e != null && e.isJsonPrimitive() && e.getAsJsonPrimitive().isString() ? e.getAsString() : null;
   }

   private static int Illillliilli(double v) {
      return Double.isNaN(v) ? 0 : (int)Math.round(IiIIIlliIIIl.IIiilIiiiIii(v, 0.0, 1000000.0));
   }

   private IIIIIillIIIIil() {
   }

   private static JsonArray IIIilIIiiIIi(double[] a) {
      long var7 = 6825389242666712230L;
      JsonArray var1 = new JsonArray();
      double[] var2 = a;
      var7 ^= ((long)a.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         double var5 = var2[(int)var10];
         var1.add(new JsonPrimitive(var5));
      }

      return var1;
   }

   static ililllilIiilllil iIlIlllllill(ililllilIiilllil r) {
      IiIIIlliIIIl var1 = new IiIIIlliIIIl();
      var1.Iiilliiliiil(r.IlIlllIlilIl());
      lliilIlliliilIll var2 = new lliilIlliliilIll();
      var2.IiIiliIiiiIi(r.IiIlliIliiIl());
      LinkedHashMap var3 = new LinkedHashMap();
      if (r.IIlllIlliIll() != null) {
         for (Entry var5 : r.IIlllIlliIll().entrySet()) {
            Map var6 = IilliliilIIi((String)var5.getKey(), (Map<String, double[]>)var5.getValue());
            if (var6 != null) {
               var3.put((String)var5.getKey(), var6);
            }
         }
      }

      long var7 = Math.max(0L, Math.min(253402300799999L, r.iliIiiliiiii()));
      return new ililllilIiilllil(
         1,
         Illlllllilll(r.IilliliilIIi()),
         Iilllilliill(r.lIiiIiIlilli()),
         var7,
         lillililiillilil.iliIiiliiiii(r.IIIllIIliIIl()),
         var1.Ililllililil(),
         var2.IlIillIiilIi(),
         var3,
         lillililiillilil.liiiIIllIl(r.Illlllllilll()).IliIlllilIi()
      );
   }

   public static String IliIlllilIi(ililllilIiilllil r) {
      long var10 = 6379791400311389493L;
      long var12 = -3738406896646989731L;
      if (r == null) {
         return null;
      } else {
         ililllilIiilllil var1 = iIlIlllllill(r);
         String var2 = lIiiIiIlilli(var1, Set.of());
         if (IIillIiliIil(var2)) {
            return var2;
         } else {
            ArrayList var3 = new ArrayList();
            var10 ^= (0L ^ var10) & -1L << 32;

            for (Entry var6 : var1.IIlllIlliIll().entrySet()) {
               for (Entry var8 : ((Map)var6.getValue()).entrySet()) {
                  String var10003 = (String)var6.getKey();
                  String var10004 = (String)var8.getKey();
                  double var10005 = ((double[])var8.getValue())[0];
                  int var10006 = (int)(var10 >>> 32);
                  var10 += 4294967296L;
                  var3.add(new lliililliliilill(var10003, var10004, var10005, var10006));
               }
            }

            var3.sort(Comparator.comparingDouble(lliililliliilill::iIlIlllllill).thenComparingInt(lliililliliilill::IilliliilIIi));
            var10 ^= (1L ^ var10) & -1L >>> 32;
            var12 ^= ((long)var3.size() << 32 ^ var12) & -1L << 32;
            String var14 = lIiiIiIlilli(var1, Ililllililil(var3, (int)(var12 >>> 32)));

            while ((int)var10 < (int)(var12 >>> 32)) {
               var12 ^= ((long)((int)var10 + (int)(var12 >>> 32) >>> 1) ^ var12) & -1L >>> 32;
               String var9 = lIiiIiIlilli(var1, Ililllililil(var3, (int)var12));
               if (IIillIiliIil(var9)) {
                  var12 ^= ((long)((int)var12) << 32 ^ var12) & -1L << 32;
                  var14 = var9;
               } else {
                  var10 ^= ((long)((int)var12 + 1) ^ var10) & -1L >>> 32;
               }
            }

            if (!IIillIiliIil(var14)) {
               var14 = lIiiIiIlilli(var1, Ililllililil(var3, (int)var10));
            }

            return IIillIiliIil(var14) ? var14 : null;
         }
      }
   }

   private static JsonArray IlIillIiilIi(int[] a) {
      long var6 = 4817671937902723561L;
      long var8 = 6199395505199169700L;
      JsonArray var1 = new JsonArray();
      int[] var2 = a;
      var6 ^= ((long)a.length << 32 ^ var6) & -1L << 32;

      for (long var11 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)var2[(int)var11] << 32 ^ var8) & -1L << 32;
         var1.add(new JsonPrimitive((int)(var8 >>> 32)));
      }

      return var1;
   }

   private static iilIlIilIIiIlIil iliIiiliiiii(JsonObject o) {
      IiIIIlliIIIl var1 = new IiIIIlliIIIl();
      if (o == null) {
         return var1.Ililllililil();
      } else {
         double[] var2 = IiIiliIiiiIi(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","NWdPvedQT57Bd0lmJ6FxqZCCNgD9A/D6PaUhkptShmFl">())), 3, 0.0);
         double[] var3 = IiIiliIiiiIi(Iiiiliiiiiii(o.get(iIIIlIlIIl<"iIIIlIlIIl","ib2OCkXCiLdjktSbHST49Gh/JxSLSzPGOpoC3WORCaLYSxM=">())), 3, 0.0);
         var1.Iiilliiliiil(
            new iilIlIilIIiIlIil(
               var2,
               var3,
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","+y8gkeOrNZvtptNoAZgdVTwKMjZiStsA3zzFGLa1f+Y8">()), 1.0),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","QYCtXwXl+tmeoNXTalL7jtVvQPqoHTQ0hq68J9a5ymrY">()), 1.0),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","jMhyDhVOIG2sZ2V7itJ/+j6I3LPeBsjULLIGi2zN5wc=">()), 1.0),
               Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","VLKCApDacxCu7J/HZfhoWJhUN5sYHMGu2yMfcobNZg==">()), 0.0),
               Illillliilli(Iilililiiili(o.get(iIIIlIlIIl<"iIIIlIlIIl","kfDyhZ+ySbkp/5oq9T482cVeT1Tgxlrowykgvs0=">()), 0.0))
            )
         );
         return var1.Ililllililil();
      }
   }

   private static JsonObject Iliilliiilii(JsonElement e) {
      return e != null && e.isJsonObject() ? e.getAsJsonObject() : null;
   }
}
