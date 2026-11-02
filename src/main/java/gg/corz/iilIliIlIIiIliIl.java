package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class iilIliIlIIiIliIl {
   private static String IIIilIIiiIIi(ilIllIiIll m) {
      return IIiiIllIiiIl.IliIlllilIi(m.lIiiIiIlilli());
   }

   private static String lIlIliIlIl() {
      try {
         return IIIIIllllIIIIlll.IIillIiliIil();
      } catch (Throwable var1) {
         return IllIllllIl<"IllIllllIl","CG3N0sC+RmmiGztpYBVh7FcwfojPuVC1vFbr+IrKFsOc">();
      }
   }

   public static boolean lIiiIiIlilli(String slug) {
      return iliIiiliiiii(slug, llilIllililIll.IilliliilIIi());
   }

   static boolean iliIiiliiiii(String slug, List<ilIllIiIll> modules) {
      liiilIliiiilIl var2 = lilllIiliilllIil.IIIllIIliIIl(slug);
      if (var2 == null) {
         return false;
      } else {
         lIlIllIliIlIllIl var3 = liiiIIllIl(var2.IIIillllllIIilllll.iiililIiIl, var2.IIIillllllIIilllll.IIIiilIiIl, var2.IIIillllllIIilllll.lIIiilIiIl, modules);
         if (var2.iIIilllllIlIilllll && var3.ilIiilIiIl.equals(var2.IIIillllllIIilllll.ilIiilIiIl)) {
            return true;
         } else {
            var3.iIIiilIiIl = var2.IIIillllllIIilllll.iIIiilIiIl;
            lilllIiliilllIil.IIIilIIiiIIi(slug, var3);
            return true;
         }
      }
   }

   public static IIIllllllIIlllll Iilililiiili(lIlIllIliIlIllIl profile, llliiillilliiill opts) {
      return Iiiiliiiiiii(profile, opts, llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   public static lIlIllIliIlIllIl IliIlllilIi(String name, String author, String description) {
      return liiiIIllIl(name, author, description, llilIllililIll.IilliliilIIi());
   }

   private static void IIillIiliIil(JsonObject m, ilIllIiIll mj, JsonObject content) {
      if (mj instanceof IIililillIililil) {
         Ililllililil(m, IllIllllIl<"IllIllllIl","rOXQKdUQUFePmV6KgmR1uWQaIB1bNw6/wYnWH33gCg==">())
            .add(IllIllllIl<"IllIllllIl","KbSX59R+NT0B+BAZ1/idGZkOO1OifXovoxyahO4gLSLgT21n">(), content);
      } else if (mj instanceof Iiliililliliilil) {
         Ililllililil(m, IllIllllIl<"IllIllllIl","qNY4dCs3URBKyysj1prPdLsnikVkKvgLQDZv4rixhUpV">())
            .add(IllIllllIl<"IllIllllIl","cCOErVSiAH1W9c2pU0meCP24NjwABsFD2OWwo5nhEb+jigYFGiGLFvl/QIU=">(), content);
      } else {
         Ililllililil(m, IllIllllIl<"IllIllllIl","ToLTHYJdCqoZPNVsEAv0JA8qgP/s6EN0gYz54KHyh47sM5Y=">()).add(IIIilIIiiIIi(mj), content);
      }
   }

   private static ilIIlIliIiIIlIli IIIIllIIIl(lIiIiIlliIiIiIll policy, String m, ilIllIiIll id) {
      return policy.Iiilliiliiil(m, id.liiiIIllIl(), ilIIlilIiIIlil.liiiIIllIl(id));
   }

   private static boolean IlIlllIlilIl(JsonElement depth, int v) {
      if (depth == null || depth.isJsonNull()) {
         return true;
      } else if (v > 12) {
         return false;
      } else if (depth.isJsonPrimitive()) {
         return !depth.getAsJsonPrimitive().isString() || depth.getAsString().length() <= 2048;
      } else if (depth.isJsonArray()) {
         for (JsonElement var5 : depth.getAsJsonArray()) {
            if (!IlIlllIlilIl(var5, v + 1)) {
               return false;
            }
         }

         return true;
      } else {
         for (Entry var3 : depth.getAsJsonObject().entrySet()) {
            if (IiiiiIIlliiiiIIl.IliIlllilIi((String)var3.getKey()) || !IlIlllIlilIl((JsonElement)var3.getValue(), v + 1)) {
               return false;
            }
         }

         return true;
      }
   }

   public static List<llllliiillllii> IiIiliIiiiIi(List<ilIllIiIll> modules) {
      ArrayList var1 = new ArrayList();

      for (final ilIllIiIll var3 : modules) {
         final String var4 = IIIilIIiiIIi(var3);
         var1.add(new llllliiillllii() {
            @Override
            public boolean iliIiiliiiii(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);
               return var2 != null && var2.IlIlllIlilIl();
            }

            @Override
            public boolean iIlIlllllill() {
               return var3.liiiIIllIl();
            }

            @Override
            public String IliIlllilIi() {
               return var4;
            }

            @Override
            public boolean IiIlliIliiIl() {
               return var3.lliIliliIl();
            }

            @Override
            public boolean IIlllIlliIll() {
               return ilIIlilIiIIlil.liiiIIllIl(var3);
            }

            @Override
            public JsonElement IIIllIIliIIl(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);

               try {
                  return var2 == null ? null : var2.IIlllIlliIll();
               } catch (Exception var4x) {
                  return null;
               }
            }

            @Override
            public int IlIlllIlilIl() {
               return var3.IIIilIIiiIIi();
            }

            @Override
            public iIiIiIIlIliIiIIl lIiiIiIlilli(String name) {
               IilliIllilliIl var2 = iilIliIlIIiIliIl.IIlilIliiIli(var3, name);
               return var2 == null ? null : var2.IiIlliIliiIl();
            }

            @Override
            public boolean liiiIIllIl() {
               return var3.IliIlllilIi();
            }

            @Override
            public String IilliliilIIi() {
               return var3.IilliliilIIi();
            }
         });
      }

      return var1;
   }

   public static lIlIllIliIlIllIl liiiIIllIl(String name, String description, String author, List<ilIllIiIll> modules) {
      lIlIllIliIlIllIl var4 = new lIlIllIliIlIllIl();
      var4.iiililIiIl = name;
      var4.IIIiilIiIl = description;
      var4.lIIiilIiIl = author;
      var4.IiililIiIl = lIlIliIlIl();
      var4.liililIiIl = IllIllllIl<"IllIllllIl","cbtRiXvR821U0EyCy10tl3O1E/+/GcX7d0+To0WYsK/+TCY=">();
      var4.ilIiilIiIl = IIIllIIliIIl(Illlllllilll(modules));
      return var4;
   }

   private static ilIllIiIll Illillliilli(List<ilIllIiIll> stableId, String modules) {
      for (ilIllIiIll var3 : stableId) {
         if (IIIilIIiiIIi(var3).equals(modules)) {
            return var3;
         }
      }

      return null;
   }

   private static int iiIIlIIlIl(ilIllIiIll settings, String own, JsonObject res, lIiIiIlliIiIiIll m, boolean id, IIIllllllIIlllll policy) {
      long var11 = 9201492814714485365L;
      var11 ^= (0L ^ var11) & -1L << 32;

      for (IilliIllilliIl var8 : settings.IiIlliIliiIl()) {
         if (!var8.IlIlllIlilIl()) {
            String var9 = var8.IliIlllilIi();
            if (res.has(var9) && (id || m.IIIilIIiiIIi(own, var9, var8.IiIlliIliiIl()) != IIIlllilIIllli.iillilIIIl)) {
               try {
                  switch (var8.Illlllllilll(res.get(var9))) {
                     case lIilllIill:
                        var11 += 4294967296L;
                        break;
                     case iIilllIill:
                        var11 += 4294967296L;
                        policy.lillilIill++;
                        break;
                     case IlilllIill:
                        policy.iIililIill
                           .add(
                              IllIllllIl<"IllIllllIl","9fkBiMV+7B741JWNc4DKtfAZDL7NEpGZW7wxk2Wd/WadOO2/M6U0lNGy37NuyA==">()
                                 + settings.IilliliilIIi()
                                 + IllIllllIl<"IllIllllIl","+fPC7MRxVZ/QFpUd28UVKYf21fkM6zVP6aIfMAs=">()
                                 + var9
                                 + IllIllllIl<"IllIllllIl","v38//CCi4Vm3+EuOll83vCoCsS1Bpgq9SqwOmNiu7M2cIXbo2iA5987UTA==">()
                           );
                     case IIilllIill:
                  }
               } catch (Exception var13) {
                  policy.iIililIill
                     .add(
                        IllIllllIl<"IllIllllIl","NigiHWJbSCjdzqBTecHqwNU1lmUd0rzpbW8nqBeGtOsrcvysgNfaBMk/yiSrRJ7+gHMH75TS">()
                           + settings.IilliliilIIi()
                           + IllIllllIl<"IllIllllIl","+fPC7MRxVZ/QFpUd28UVKYf21fkM6zVP6aIfMAs=">()
                           + var9
                     );
               }
            }
         }
      }

      return (int)(var11 >>> 32);
   }

   private static JsonObject Ililllililil(JsonObject content, String key) {
      if (!content.has(key)) {
         content.add(key, new JsonObject());
      }

      return content.getAsJsonObject(key);
   }

   public static IIIllllllIIlllll Iliilliiilii(liiilIliiiilIl persist, List<ilIllIiIll> preset, Runnable modules) {
      if (persist == null) {
         IIIllllllIIlllll var3 = new IIIllllllIIlllll();
         var3.IlililIill = IllIllllIl<"IllIllllIl","ogwPXMOchtc77xJJmC5z6odGK/Jc1WjTlfgdtPdNbU6EI4wJDT8MSKBV7/UUgTE=">();
         return var3;
      } else {
         return Iiiiliiiiiii(
            persist.IIIillllllIIilllll, persist.iIIilllllIlIilllll ? llliiillilliiill.IilliliilIIi() : llliiillilliiill.iIlIlllllill(), preset, modules
         );
      }
   }

   public static String iIlIlllllill(String author, String name, String description) {
      return IilliliilIIi(author, name, description, llilIllililIll.IilliliilIIi());
   }

   private static JsonObject Iiilliiliiil(ilIllIiIll m) {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IllIllllIl<"IllIllllIl","zf2q8mSgNJKDfHF/EE3RkW+cEbmr/UEAugmB/PfdmZmz0qY=">(), m.IliIlllilIi());
      var1.addProperty(IllIllllIl<"IllIllllIl","jSg5OFjXJCAZVagqgazSHbHWm2IhjThvHsiUyfrBN3fjoa4=">(), m.IIIilIIiiIIi());
      JsonObject var2 = new JsonObject();

      for (IilliIllilliIl var4 : m.IiIlliIliiIl()) {
         if (!var4.IlIlllIlilIl()) {
            JsonElement var5 = var4.IIlllIlliIll();
            if (var5 != null) {
               var2.add(var4.IliIlllilIi(), var5);
            }
         }
      }

      var1.add(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">(), var2);
      if (m.lliIliliIl()) {
         JsonElement var6 = m.IIiIllIiIl();
         if (var6 != null) {
            var1.add(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">(), var6);
         }
      }

      return var1;
   }

   public static lIlIllIliIlIllIl IIlllIlliIll(lIlIllIliIlIllIl modules, List<ilIllIiIll> profile) {
      if (modules == null) {
         return null;
      } else {
         lIlIllIliIlIllIl var2 = modules.IIlllIlliIll();
         var2.ilIiilIiIl = Ilillillllillill.iliIiiliiiii(modules.ilIiilIiIl, IiIiliIiiiIi(profile), lIiIiIlliIiIiIll.IliIlllilIi());
         return var2;
      }
   }

   private static boolean llIIlilIIl(lIiIiIlliIiIiIll policy, String m, ilIllIiIll id, boolean own) {
      return own ? !id.liiiIIllIl() : policy.IiIiliIiiiIi(IIIIllIIIl(policy, m, id), true);
   }

   public static IIIllllllIIlllll Iiiiliiiiiii(lIlIllIliIlIllIl profile, llliiillilliiill modules, List<ilIllIiIll> persist, Runnable opts) {
      long var14 = 7921115002173583239L;
      IIIllllllIIlllll var4 = new IIIllllllIIlllll();
      if (profile == null) {
         var4.IlililIill = IllIllllIl<"IllIllllIl","ogwPXMOchtc77xJJmC5z6odGK/Jc1WjTlfgdtPdNbU6EI4wJDT8MSKBV7/UUgTE=">();
         return var4;
      } else {
         if (modules == null) {
            modules = llliiillilliiill.liiiIIllIl();
         }

         lIiIiIlliIiIiIll var5 = lIiIiIlliIiIiIll.IliIlllilIi();
         if (!var5.IlIlllIlilIl()) {
            var4.IlililIill = IllIllllIl<"IllIllllIl","tM7zQ6BIW4Je+S8fS6eLWTWCxfDObOyjZTaLIxlH/T5BJJgdVSUSqeTY7R51woE1eWhnJqD0OK6GQtcLuvvS3DXMPUxInfKJRDNIUjiGy0lN9p4z">();
            return var4;
         } else {
            var14 ^= ((long)modules.IliIlllilIi() << 32 ^ var14) & -1L << 32;
            JsonObject var7 = Illlllllilll(persist);
            Ilillillllillill var8 = Ilillillllillill.liiiIIllIl(profile.ilIiilIiIl, modules, IiIiliIiiiIi(persist), var5);
            var4.iIililIill.addAll(var8.IlliiIiill);

            try {
               for (Entry var10 : var8.lIiiiIiill.entrySet()) {
                  String var11 = (String)var10.getKey();
                  ilIllIiIll var12 = Illillliilli(persist, var11);
                  if (var12 != null) {
                     JsonObject var13 = (JsonObject)var10.getValue();
                     if (var13.has(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">())
                        && var13.get(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">()).isJsonObject()) {
                        var4.illlilIill = var4.illlilIill
                           + iiIIlIIlIl(
                              var12,
                              var11,
                              var13.getAsJsonObject(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">()),
                              var5,
                              (boolean)((int)(var14 >>> 32)),
                              var4
                           );
                     }

                     if (var13.has(IllIllllIl<"IllIllllIl","jSg5OFjXJCAZVagqgazSHbHWm2IhjThvHsiUyfrBN3fjoa4=">())
                        && iIIIlIlIIl(
                           var5,
                           var11,
                           var12,
                           var13.get(IllIllllIl<"IllIllllIl","jSg5OFjXJCAZVagqgazSHbHWm2IhjThvHsiUyfrBN3fjoa4=">()).getAsInt(),
                           (boolean)((int)(var14 >>> 32))
                        )) {
                        var12.IlIillIiilIi(var13.get(IllIllllIl<"IllIllllIl","jSg5OFjXJCAZVagqgazSHbHWm2IhjThvHsiUyfrBN3fjoa4=">()).getAsInt());
                        var4.IillilIill++;
                     }

                     if (var13.has(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">())
                        && var12.lliIliliIl()
                        && ((int)(var14 >>> 32) != 0 || var5.Iliilliiilii(var11))) {
                        var12.iIiIlIliIl(var13.get(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">()));
                     }

                     var12.IiiIlliiIl();
                  }
               }

               for (String var21 : var8.liIiiIiill) {
                  ilIllIiIll var24 = Illillliilli(persist, var21);
                  if (var24 != null) {
                     var24.IIillIiliIil(false);
                  }
               }

               for (String var22 : var8.IiIiiIiill) {
                  ilIllIiIll var25 = Illillliilli(persist, var22);
                  if (var25 != null && llIIlilIIl(var5, var22, var25, (boolean)((int)(var14 >>> 32)))) {
                     var25.IIillIiliIil(true);
                  }
               }

               opts.run();
               var4.IIililIill = (boolean)((int)(var14 >>> 32));
               var4.iillilIill = var8.IiliiIiill;

               for (String var23 : var8.IIliiIiill) {
                  ilIllIiIll var26 = Illillliilli(persist, var23);
                  var4.lIililIill.add(var26 != null ? var26.IilliliilIIi() : var23);
               }

               var4.IlllilIill = true;
               return var4;
            } catch (Exception var17) {
               try {
                  IiIIlliIIl(var7, persist);
                  opts.run();
                  var4.llllilIill = true;
               } catch (Exception var16) {
               }

               var4.IlililIill = IllIllllIl<"IllIllllIl","mwOSI1Su3gziC3eRdUxAtEhSM50rfS/gQkmDCPWCCGOR+6+ceTdH6idp">() + var17.getMessage();
               return var4;
            }
         }
      }
   }

   public static List<llllliiillllii> IlIillIiilIi() {
      return IiIiliIiiiIi(llilIllililIll.IilliliilIIi());
   }

   private static JsonObject Illlllllilll(List<ilIllIiIll> modules) {
      JsonObject var1 = new JsonObject();
      var1.add(IllIllllIl<"IllIllllIl","ToLTHYJdCqoZPNVsEAv0JA8qgP/s6EN0gYz54KHyh47sM5Y=">(), new JsonObject());

      for (ilIllIiIll var3 : modules) {
         IIillIiliIil(var1, var3, Iiilliiliiil(var3));
      }

      return var1;
   }

   static lIlIllIliIlIllIl Iilllilliill(JsonObject root, List<ilIllIiIll> modules) {
      lIlIllIliIlIllIl var2 = new lIlIllIliIlIllIl();
      var2.iiililIiIl = IllIllllIl<"IllIllllIl","6dSGynQbbvp+0ngHws0CwM31P0xQusy3jgKFvxVsLzD+yu1GXb4C8A==">();
      JsonObject var3 = new JsonObject();
      var3.add(IllIllllIl<"IllIllllIl","ToLTHYJdCqoZPNVsEAv0JA8qgP/s6EN0gYz54KHyh47sM5Y=">(), new JsonObject());

      for (ilIllIiIll var5 : modules) {
         JsonElement var6 = Iiiilliiil.IIIllIIliIIl(root, var5);
         if (var6 != null && var6.isJsonObject()) {
            IIillIiliIil(var3, var5, var6.getAsJsonObject().deepCopy());
         }
      }

      var2.ilIiilIiIl = var3;
      return var2;
   }

   private iilIliIlIIiIliIl() {
   }

   private static void IiIIlliIIl(JsonObject modules, List<ilIllIiIll> backup) {
      long var11 = -6213940101298017296L;

      for (String var3 : Ilillillllillill.ilIiiIiill) {
         if (modules.has(var3)) {
            for (Entry var5 : modules.getAsJsonObject(var3).entrySet()) {
               ilIllIiIll var6 = Illillliilli(backup, (String)var5.getKey());
               if (var6 != null) {
                  JsonObject var7 = ((JsonElement)var5.getValue()).getAsJsonObject();

                  for (IilliIllilliIl var9 : var6.IiIlliIliiIl()) {
                     if (!var9.IlIlllIlilIl()
                        && var7.getAsJsonObject(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">()).has(var9.IliIlllilIi())) {
                        try {
                           var9.Illlllllilll(
                              var7.getAsJsonObject(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">()).get(var9.IliIlllilIi())
                           );
                        } catch (Exception var13) {
                        }
                     }
                  }

                  var6.IlIillIiilIi(var7.get(IllIllllIl<"IllIllllIl","jSg5OFjXJCAZVagqgazSHbHWm2IhjThvHsiUyfrBN3fjoa4=">()).getAsInt());
                  if (var7.has(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">()) && var6.lliIliliIl()) {
                     var6.iIiIlIliIl(var7.get(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">()));
                  }

                  var11 ^= ((long)var7.get(IllIllllIl<"IllIllllIl","zf2q8mSgNJKDfHF/EE3RkW+cEbmr/UEAugmB/PfdmZmz0qY=">()).getAsBoolean() << 32 ^ var11)
                     & -1L << 32;
                  if ((int)(var11 >>> 32) != var6.IliIlllilIi()) {
                     var6.IIillIiliIil((boolean)((int)(var11 >>> 32)));
                  }
               }
            }
         }
      }
   }

   static String IilliliilIIi(String name, String modules, String description, List<ilIllIiIll> author) {
      return lilllIiliilllIil.Iiilliiliiil(liiiIIllIl(name, modules, description, author));
   }

   private static JsonObject IIIllIIliIIl(JsonObject content) {
      for (String var2 : Ilillillllillill.ilIiiIiill) {
         if (content.has(var2)) {
            JsonObject var3 = content.getAsJsonObject(var2);

            for (String var5 : List.copyOf(var3.keySet())) {
               if (IiiiiIIlliiiiIIl.IliIlllilIi(var5)) {
                  var3.remove(var5);
               } else {
                  JsonObject var6 = var3.getAsJsonObject(var5);
                  JsonObject var7 = var6.getAsJsonObject(IllIllllIl<"IllIllllIl","wDJ0JgBOasXT9DHLBikxhNuaYO3rMgq7P+q/NAufrMJldnd6">());

                  for (String var9 : List.copyOf(var7.keySet())) {
                     if (IiiiiIIlliiiiIIl.IliIlllilIi(var9) || !IlIlllIlilIl(var7.get(var9), 6)) {
                        var7.remove(var9);
                     }
                  }

                  if (var6.has(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">())
                     && !IlIlllIlilIl(var6.get(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">()), 5)) {
                     var6.remove(IllIllllIl<"IllIllllIl","p1TF1xqvJ7Fl5bRwofCD9oqbemKIwO63OS6BFNDQ4yKK">());
                  }
               }
            }
         }
      }

      return content;
   }

   private static boolean iIIIlIlIIl(lIiIiIlliIiIiIll policy, String id, ilIllIiIll key, int m, boolean own) {
      return own ? llIllIlilIllIl.IilliliilIIi(m) : policy.Illillliilli(IIIIllIIIl(policy, id, key), m);
   }

   public static IIIllllllIIlllll IIiilIiiiIii(liiilIliiiilIl preset) {
      return Iliilliiilii(preset, llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   public static lIlIllIliIlIllIl IiIlliIliiIl(lIlIllIliIlIllIl profile) {
      return IIlllIlliIll(profile, llilIllililIll.IilliliilIIi());
   }

   private static IilliIllilliIl IIlilIliiIli(ilIllIiIll m, String name) {
      for (IilliIllilliIl var3 : m.IiIlliIliiIl()) {
         if (var3.IliIlllilIi().equals(name)) {
            return var3;
         }
      }

      return null;
   }
}
