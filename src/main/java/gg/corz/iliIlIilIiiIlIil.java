package gg.corz;

import com.mojang.brigadier.suggestion.Suggestion;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1109;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1934;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_2596;
import net.minecraft.class_2639;
import net.minecraft.class_2675;
import net.minecraft.class_2703;
import net.minecraft.class_2739;
import net.minecraft.class_2765;
import net.minecraft.class_2767;
import net.minecraft.class_2805;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_7439;
import net.minecraft.class_7923;
import net.minecraft.class_2703.class_5893;

public final class iliIlIilIiiIlIil extends ilIllIiIll {
   private volatile List<String> IlllIIlIil;
   private Object llllIIlIil;
   private final IiiiiIilliiiiIil IiIlIIlIil = new IiiiiIilliiiiIil();
   private int IillIIlIil;
   private final Map<String, Long> lIllIIlIil;
   private final ConcurrentLinkedQueue<lIliliIlil> iiIlIIlIil;
   private final lllliilillliil liIlIIlIil = new lllliilillliil();
   private final Set<Integer> IIllIIlIil;
   private final Deque<iIiiiIilIliiiIil> iIllIIlIil;
   private int illlIIlIil;
   private static final double ilIlIIlIil = 4096.0;

   private static long lliililiil() {
      return System.currentTimeMillis();
   }

   private boolean llIililIil(String name) {
      if (name == null) {
         return false;
      } else {
         String var2 = name.toLowerCase(Locale.ROOT);
         long var3 = lliililiil();
         return this.iIllIIlIil
            .stream()
            .anyMatch(
               line -> var3 - line.llIIiilIil < (-6298364803633148003L ^ -6298364803633147683L)
                     && line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(var2)
                     && (
                        line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(IliIlllilIi<"IliIlllilIi","MbuvVXQpZG8BbOkKgd10Mom/18JX6yjEhNVWZZUoI2Y=">())
                           || line.IlIIiilIil.toLowerCase(Locale.ROOT).contains(IliIlllilIi<"IliIlllilIi","RTMkvi716nuI6ppSwgQ6KKUyBw6PH4eA5qyG5PsM8n0=">())
                           || line.IlIIiilIil
                              .toLowerCase(Locale.ROOT)
                              .contains(IliIlllilIi<"IliIlllilIi","tCfnZtdqG0fCfsFHyc1Py6GKYPP5A5EwdTJPwpRJZ4ktHjWj+ws=">())
                     )
            );
      }
   }

   private void IIllllIlll(int entityId) {
      if (Iiiilllliiilll.field_1687.method_8469(entityId) instanceof class_1657 var2
         && var2 != Iiiilllliiilll.field_1724
         && var2.method_5767()
         && var2.method_5858(Iiiilllliiilll.field_1724) <= Double.longBitsToDouble(4870242424765702146L ^ 227031208946720770L)
         && this.IiIlIIlIil.liiiIIllIl(var2.method_5667())) {
         this.Ilillllill(
            var2.method_5667(),
            this.IiIlIIlIil.iIlIlllllill(var2.method_5667()),
            IiiIIIliliiIIIli.lIIIllIlIi,
            IliIlllilIi<"IliIlllilIi","ACrR8KSSQ05zGXNLN8HUNSPT5NiIqhZifZ/vFFAVPS/Nf4Q8+xmjHgGNfslTnzU0FXij8bUc1kEdbQhYFdSFmig=">()
         );
      }
   }

   private boolean liilliiill(class_243 point) {
      if (point != null && !(point.method_1025(Iiiilllliiilll.field_1724.method_73189()) > 4096.0)) {
         for (class_1297 var3 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var3 != Iiiilllliiilll.field_1724) {
               if (var3 instanceof class_1657 var4 && !var4.method_5767() && var3.method_73189().method_1025(point) <= 16.0) {
                  return true;
               }

               if (var3 instanceof class_1676 && var3.method_73189().method_1025(point) <= 16.0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   protected void Iilililiiili() {
      this.lIliliIlil();
   }

   private void Ilillllill(UUID id, String clue, IiiIIIliliiIIIli detail, String subject) {
      llilllllililllll var5 = this.liIlIIlIil.IliIlllilIi(id, clue, detail, subject, lliililiil());
      if (var5.lIiiIiIlilli()) {
         String var6 = liIlliIiiiIlliIi.Iillllilll(var5.liiiIIllIl());
         String var7 = var6
            + IliIlllilIi<"IliIlllilIi","HzHzYqwRkgUsJDsVf8hZt9fsrINF8gWA3B9ar/wZRg==">()
            + var5.iIlIlllllill()
            + IliIlllilIi<"IliIlllilIi","euNNxZy++TOEOD7nPzGBONapMuzfHwlf6FjLoZkPWxxhUd6B3jRaaGY=">()
            + var5.IilliliilIIi()
            + IliIlllilIi<"IliIlllilIi","SeTH/HrrEjds4Rz4sfhipqZiG1E2xrWM23OMyso=">();
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(IliIlllilIi<"IliIlllilIi","JIXkBxhLvG8NzwxFwtSMCFeeqpwfsOz3TiFv+YHF8r0ww+5ah3sHAsMPX0NVIy6wBliWgUg=">() + var7), false
            );
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<"IliIlllilIi","P19tg3rDVm/NPgdGfH5dOvxVplOcELk+3BCXUxUy5fI1yzjcR6I=">(), var7, false);
         Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3417.field_15203, 1.0F, 1.0F));
      }
   }

   private static boolean illilIilil(String value) {
      String var1 = IIiillIiil(value);
      return (
            var1.contains(IliIlllilIi<"IliIlllilIi","N0iqn845gISQFHaAcfyAK9o4iKN872Ebc1QA6fioV8LM">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","+BWMUc5CmQRlQgtanZIDcHHVAwYUtXQP9aIQhMz7RiZdsw==">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","xOqOyU1wwxqPDsKthgqaUT8MKthaO61MHjB0lTTrNFVJhyJ705uR">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","utH3upJDMjCpnysx686+Ha5zMfCsqweymUpN2E7v6JI=">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","kyIchUdUhqsiTNS8NkMSgmzW0fwoW50p07t38r+4qMrS8FPC3Wk=">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","/WkDl4uu/vdgF6qn36R+0UyKDPgNKtulLoZK9Hn5jfx9xQ==">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","3XXzKiy4m+R1fH+Okwx3SFyYMFbNGP4uh7Tsd5jkxbhN">())
         )
         && (
            var1.contains(IliIlllilIi<"IliIlllilIi","3WdXi/ZzK+5asqlNN2tLt9cQaePJJxguhV5lhMFd88M=">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","SNNSmkQwNk1jDsvGeAJr441qJJbvrGXnZrQ3xI1JsdrJ">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","O+XaggLAciBzN12aF0HCdIXBkZGWD7CpEzLFPm2dTYLi">())
               || var1.contains(IliIlllilIi<"IliIlllilIi","0G9gXOgIIxh8NCOoDDuHKJnVjYj52ymlY0n502XzEGbznA==">())
         );
   }

   private UUID Illillllil(class_2561 text) {
      if (text != null
         && text.method_10851() instanceof class_2588 var2
         && IliIlllilIi<"IliIlllilIi","xA5w4l5Hsxx6Doh+kx4Qyfs40ApzK08mLucsZLjK8zljGG4Ysz3gpQMkg7fSbD/sacaN">().equals(var2.method_11022())
         && var2.method_11023().length != 0) {
         Object var6 = var2.method_11023()[0];
         String var4 = var6 instanceof class_2561 var5 ? var5.getString() : String.valueOf(var6);
         return this.IiIlIIlIil.IilliliilIIi(var4);
      } else {
         return null;
      }
   }

   private void lllllillll(class_243 sound, String point) {
      if (illilIilil(point) && !this.liilliiill(sound)) {
         String var3 = this.IiIilliIil(sound);
         this.ilillIiill(
            IliIlllilIi<"IliIlllilIi","xbYKjHM01zGY7ZEAAO3dqtzt9Vn/rqg/GQcaQaSSjcaM7w==">() + var3 + IIiillIiil(point),
            null,
            var3,
            IiiIIIliliiIIIli.IlIIllIlIi,
            IliIlllilIi<"IliIlllilIi","LRaGNzik+xAKixotnvvjN298Kv8ILxSpTr2199ZnTkmbtT1DZuqWl9NKYxELm21qRmfgHulybtFF">(),
            -2412575630095131436L ^ -2412575630095133836L
         );
      }
   }

   private static String IIiillIiil(String value) {
      long var2 = -3952348811750376344L;
      if (value == null) {
         return IliIlllilIi<"IliIlllilIi","jp8Jq3RkqiGt/W/Ea6it9Jcox0eJ+qYs+AjVKl+osgQdSxs=">();
      } else {
         var2 ^= ((long)value.indexOf(--1960892740 * -1643291835 ^ 1850325870) << 32 ^ var2) & -1L << 32;
         return ((int)(var2 >>> 32) < 0 ? value : value.substring((int)(var2 >>> 32) + 1)).toLowerCase(Locale.ROOT);
      }
   }

   private static String iIiilIliil(class_3414 sound) {
      return sound != null && sound.comp_3319() != null ? sound.comp_3319().toString() : "";
   }

   private void IlIllllIll() {
      for (class_1657 var2 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var2 != Iiiilllliiilll.field_1724
            && var2.method_5767()
            && !(var2.method_5858(Iiiilllliiilll.field_1724) > 4096.0)
            && this.IiIlIIlIil.liiiIIllIl(var2.method_5667())) {
            this.Ilillllill(
               var2.method_5667(),
               this.IiIlIIlIil.iIlIlllllill(var2.method_5667()),
               IiiIIIliliiIIIli.lIIIllIlIi,
               IliIlllilIi<"IliIlllilIi","meQuGfklHfqZpPXitugK1fXHy8sdUyQ2rsSNemcTWfiEFrPPWsdkavUqiDwDt0ymM9yfoKg9Pw==">()
            );
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.method_1562() != null) {
         if (this.llllIIlIil != null && this.llllIIlIil != Iiiilllliiilll.field_1687) {
            this.lIliliIlil();
         }

         this.llllIIlIil = Iiiilllliiilll.field_1687;
         this.illlIIlIil++;
         this.ilIllIiIll();
         if (this.illlIIlIil % 5 == 0) {
            this.lIIlliIIll();
            this.IlIllllIll();
         }

         if (this.illlIIlIil % 120 == 0) {
            this.iilllIIill();
         }

         this.lIilliIill();
         this.iiIilIIlil();
      } else {
         this.lIliliIlil();
      }
   }

   private void iIIilIlIil(String text) {
      this.iIllIIlIil.addLast(new iIiiiIilIliiiIil(text, lliililiil()));

      while (this.iIllIIlIil.size() > 48) {
         this.iIllIIlIil.removeFirst();
      }
   }

   private boolean IIIillIIil(class_243 particle, String point) {
      if (!IIiillIiil(point).contains(IliIlllilIi<"IliIlllilIi","AgHf0yMpLkxusdKhVZWtRK17Vhsa7Ip1rstzMORqTlYZ">())) {
         return false;
      } else {
         class_2338 var3 = class_2338.method_49638(particle);

         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -2; var5 <= 2; var5++) {
               for (int var6 = -2; var6 <= 2; var6++) {
                  class_2960 var7 = class_7923.field_41175
                     .method_10221(Iiiilllliiilll.field_1687.method_8320(var3.method_10069(var4, var5, var6)).method_26204());
                  String var8 = IIiillIiil(var7 == null ? "" : var7.toString());
                  if (var8.contains(IliIlllilIi<"IliIlllilIi","c+Zk/xCNVlSYl12gtIDHqStVqfVpwlvdqh9GLmcV3lk=">())
                     || var8.contains(IliIlllilIi<"IliIlllilIi","nnTwF5MoqfWg6k1M+BFgmNwRKm2JLjPuGyE9Dh2/HR7b">())
                     || var8.contains(IliIlllilIi<"IliIlllilIi","lttdblBdKetNtN31htGyRGwQLbgpQy5t1rehj5ifVlvZ//Q=">())
                     || var8.contains(IliIlllilIi<"IliIlllilIi","a55BYiwzy3IoMa8mJL91utsyfZjGnFMGIIsqy0RI49VGJw==">())
                     || var8.contains(IliIlllilIi<"IliIlllilIi","QMs3e18n8OkWya+ZybQJ1vHTbs58ZgA4wqRY6Z5eexg9PA==">())) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   private void liIlliiIll(UUID id, String mode) {
      if (id != null && this.IiIlIIlIil.liiiIIllIl(id) && class_1934.field_9219.method_8381().equals(mode)) {
         this.Ilillllill(
            id,
            this.IiIlIIlIil.iIlIlllllill(id),
            IiiIIIliliiIIIli.IIIIllIlIi,
            IliIlllilIi<"IliIlllilIi","7r7gLuhhIWhULDJfNcXYFSSwaWVjhf6M0k3NB5apO8UYJP1nIrp32AR1w9ES/AO2/c4dNtHqig==">()
         );
      }
   }

   public List<IilIilIllilIilIl> iiiIlIIIll() {
      return this.liIlIIlIil
         .iIlIlllllill(lliililiil())
         .stream()
         .limit(4L)
         .map(decision -> new IilIilIllilIilIl(decision.liiiIIllIl(), decision.iIlIlllllill()))
         .toList();
   }

   private void iIlllIllll(int sound, String entityId) {
      if (illilIilil(entityId)) {
         if (Iiiilllliiilll.field_1687.method_8469(sound) instanceof class_1657 var3
            && var3 != Iiiilllliiilll.field_1724
            && var3.method_5767()
            && this.IiIlIIlIil.liiiIIllIl(var3.method_5667())) {
            this.Ilillllill(
               var3.method_5667(),
               this.IiIlIIlIil.iIlIlllllill(var3.method_5667()),
               IiiIIIliliiIIIli.iIIIllIlIi,
               IliIlllilIi<"IliIlllilIi","m32crG6gWbfarmJFGlmfq6OXfcZq7BR+wOr0jq+G7m5zero/EaPcxDDdWYkoZAyLJhFu53i1yWvOKE4wt+pBqRPb">()
            );
         }
      }
   }

   private void ilIllIiIll() {
      for (int var1 = 0; var1 < 384; var1++) {
         lIliliIlil var2 = this.iiIlIIlIil.poll();
         if (var2 == null) {
            break;
         }

         switch (var2.ilIilliIiIilli) {
            case iiilIiIill:
               this.liIlliiIll(var2.liIilliiiIilli, var2.iililliIIiilli);
               break;
            case lIIiIiIill:
               this.IIllllIlll(var2.IIlillilIlilli);
               break;
            case IlIiIiIill:
               this.iIlllIllll(var2.IIlillilIlilli, var2.iililliIIiilli);
               break;
            case iIIiIiIill:
               this.lllllillll(var2.lIiiIiIlilli(), var2.iililliIIiilli);
               break;
            case ilIiIiIill:
               this.Iillllilll(var2.lIiiIiIlilli(), var2.iililliIIiilli);
               break;
            case IIIiIiIill:
               this.iIIilIlIil(var2.iililliIIiilli);
               break;
            case llIiIiIill:
               this.liIlIIlIil.liiiIIllIl(var2.liIilliiiIilli);
         }
      }

      while (this.iiIlIIlIil.size() > 2048) {
         this.iiIlIIlIil.poll();
      }
   }

   private void Iillllilll(class_243 particle, String point) {
      if (lililiilil(point) && !this.liilliiill(particle) && !this.IIIillIIil(particle, point)) {
         String var3 = this.IiIilliIil(particle);
         this.ilillIiill(
            IliIlllilIi<"IliIlllilIi","Kwi7DC/oC4gWWaAtMIh8DQ82wgJkal9Ayay1y7OkDMi42V4Y7Q==">() + var3 + IIiillIiil(point),
            null,
            var3,
            IiiIIIliliiIIIli.llIIllIlIi,
            IliIlllilIi<"IliIlllilIi","/XcpfcTRwNTsj1jNJBjBgetxBRguF+oMiExTI35COrkvFAn5P6VI+nV3CU7ojzkOlarUd/zPnn5Q9yYDbg==">(),
            1809503060858530444L ^ 1809503060858529068L
         );
      }
   }

   @Override
   protected void Illillliilli() {
      this.lIliliIlil();
      this.lIIlliIIll();
   }

   private void lIilliIill() {
      List var1 = this.IlllIIlIil;
      if (var1 != null) {
         this.IlllIIlIil = null;
         Set var2 = this.IiIlIIlIil.lIiiIiIlilli(Iiiilllliiilll);
         List var3 = var1.stream()
            .filter(IiiiiIilliiiiIil::IIIllIIliIIl)
            .filter(name -> !var2.contains(name.toLowerCase(Locale.ROOT)))
            .filter(name -> !name.equalsIgnoreCase(Iiiilllliiilll.field_1724.method_5477().getString()))
            .filter(name -> !this.llIililIil(name))
            .toList();
         if (var3.size() <= 3) {
            for (String var5 : var3) {
               this.Ilillllill(
                  this.IiIlIIlIil.IilliliilIIi(var5),
                  var5,
                  IiiIIIliliiIIIli.iiiiIlIlIi,
                  IliIlllilIi<"IliIlllilIi","Igzeyz1IZwes0FPZK/XfBq4Ir0+2ZI9Ix8tU7Rxzzj1UbZVAIL8BM/ltHhAN+VPMWVqdN2GMxdiVTvlZSETtUyZ5CHhBew==">()
               );
            }
         }
      }
   }

   private String IiIilliIil(class_243 point) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_73189();
      double var3 = point.field_1352 - var2.field_1352;
      double var5 = point.field_1351 - var2.field_1351;
      double var7 = point.field_1350 - var2.field_1350;
      String var9 = var7 < Double.longBitsToDouble(1571367773067110399L ^ -6179327185637513217L)
         ? IliIlllilIi<"IliIlllilIi","iqb2/4c4rCtx9ecOn5VFEWfqIaytTKncHA0LlVU=">()
         : (
            var7 > Double.longBitsToDouble(-2119235580012396428L ^ -2493034349084147596L)
               ? IliIlllilIi<"IliIlllilIi","djITFgQo6Pw5yfYen+QZwdEt+KNuWu6YordKN1M=">()
               : ""
         );
      String var10 = var3 < Double.longBitsToDouble(6519308326303228308L ^ -1906926576506969708L)
         ? IliIlllilIi<"IliIlllilIi","GOMm4f7K5NNmhTxEGSmWDb8/Jv5GvLG8fsjC4lQ=">()
         : (
            var3 > Double.longBitsToDouble(3439175983784408250L ^ 1173865371217048762L)
               ? IliIlllilIi<"IliIlllilIi","gP4Fc1bjAP0ERD4AmLDexCVoCOxiGUKWNP3eC5g=">()
               : ""
         );
      return Math.round(Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7))
         + IliIlllilIi<"IliIlllilIi","r78DKXI7rEano2DHfLzgu5BKn1cKjb0gCEq6TgBG">()
         + var9
         + var10;
   }

   private void iiIilIIlil() {
      long var1 = lliililiil();

      while (!this.iIllIIlIil.isEmpty() && var1 - this.iIllIIlIil.peekFirst().llIIiilIil > 8000L) {
         this.iIllIIlIil.removeFirst();
      }

      this.lIllIIlIil.entrySet().removeIf(timestamp -> var1 - timestamp.getValue() > (3225693962436829388L ^ 3225693962436840108L));
      this.liIlIIlIil.iIlIlllllill(var1);
   }

   private void lIIlliIIll() {
      long var1 = lliililiil();

      for (llIiIlIiilIiIlIi var4 : this.IiIlIIlIil.IliIlllilIi(Iiiilllliiilll, var1)) {
         if (!this.llIililIil(var4.liiiIIllIl())) {
            this.Ilillllill(
               var4.IliIlllilIi(),
               var4.liiiIIllIl(),
               IiiIIIliliiIIIli.liiiIlIlIi,
               IliIlllilIi<"IliIlllilIi","owPvZxrH8PT5kw5YrEN6Vqlg8OJZnl8zBhiMKtXFJMu9zbPg2VVeuC2ArfGj38Q7ag==">()
            );
         } else {
            this.liIlIIlIil.liiiIIllIl(var4.IliIlllilIi());
         }
      }
   }

   public iliIlIilIiiIlIil() {
      super(IliIlllilIi<"IliIlllilIi","P19tg3rDVm/NPgdGfH5dOvxVplOcELk+3BCXUxUy5fI1yzjcR6I=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.iiIlIIlIil = new ConcurrentLinkedQueue<>();
      this.IIllIIlIil = ConcurrentHashMap.newKeySet();
      this.lIllIIlIil = new HashMap<>();
      this.iIllIIlIil = new ArrayDeque<>();
      this.IillIIlIil = -(-1690489094 << 3 | -1690489094 >>> 29) ^ 638986244;
   }

   private void iilllIIill() {
      int var1 = this.IillIIlIil++;
      if (this.IillIIlIil > 49000) {
         this.IillIIlIil = 41000;
      }

      this.IIllIIlIil.add(var1);

      while (this.IIllIIlIil.size() > 6) {
         this.IIllIIlIil.remove(this.IIllIIlIil.iterator().next());
      }

      try {
         Iiiilllliiilll.method_1562()
            .method_52787(new class_2805(var1, IliIlllilIi<"IliIlllilIi","zXX3AVEUWpmnA+9Q76RKGEGFAYBfOhfexWnmsJ/Wz2+UcnJcK2aG6BFB">()));
      } catch (Throwable var3) {
         this.IIllIIlIil.remove(var1);
      }
   }

   private void ilillIiill(String detail, UUID subject, String id, IiiIIIliliiIIIli clue, String delay, long key) {
      long var8 = lliililiil();
      if (var8 - this.lIllIIlIil.getOrDefault(detail, 0L) >= key) {
         this.lIllIIlIil.put(detail, var8);
         this.Ilillllill(subject, id, clue, delay);
      }
   }

   private static boolean lililiilil(String value) {
      String var1 = IIiillIiil(value);
      return var1.contains(IliIlllilIi<"IliIlllilIi","pnckWxoMsOcKTCEKNtZaTlma19WVYDBUQWbKOgZ4sh0=">())
         || var1.contains(IliIlllilIi<"IliIlllilIi","j1g9YcJeRMiAGynZMVmPrPpy8u9iGHw5XUeVdsLa498BqPHxSbS6syo=">())
         || var1.contains(IliIlllilIi<"IliIlllilIi","s8W3lc52DcDKBASlzOG+Ft5OUacr0egNIS8WaLdfJp5MmVhO7oiOhWddIzg=">())
         || var1.contains(IliIlllilIi<"IliIlllilIi","AgHf0yMpLkxusdKhVZWtRK17Vhsa7Ip1rstzMORqTlYZ">());
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var2 = event.iilIIiiIll;
      if (var2 instanceof class_2639 var3 && this.IIllIIlIil.remove(var3.comp_2262())) {
         ArrayList var15 = new ArrayList();

         for (Suggestion var12 : var3.method_11397().getList()) {
            String var13 = var12.getText();
            if (var13 != null && !var13.isBlank()) {
               var15.add(var13.trim());
            }
         }

         this.IlllIIlIil = var15;
         event.IliIlllilIi();
         return;
      }

      if (var2 instanceof class_2703 var4 && var4.method_46327().contains(class_5893.field_29137)) {
         var4.method_46329()
            .stream()
            .filter(entry -> entry.comp_1110() != null)
            .forEach(entry -> this.iiIlIIlIil.offer(lIliliIlil.IliIlllilIi(iIilllllIlilllll.iiilIiIill, entry.comp_1106(), entry.comp_1110().method_8381())));
         return;
      }

      if (var2 instanceof class_2739 var5) {
         this.iiIlIIlIil.offer(lIliliIlil.liiiIIllIl(iIilllllIlilllll.IIIiIiIill, var5.comp_1127(), ""));
      } else if (var2 instanceof class_2765 var6) {
         this.iiIlIIlIil.offer(lIliliIlil.liiiIIllIl(iIilllllIlilllll.lIIiIiIill, var6.method_11883(), iIiilIliil((class_3414)var6.method_11882().comp_349())));
      } else if (var2 instanceof class_2767 var7) {
         this.iiIlIIlIil
            .offer(
               lIliliIlil.iIlIlllllill(
                  iIilllllIlilllll.iIIiIiIill,
                  var7.method_11890(),
                  var7.method_11889(),
                  var7.method_11893(),
                  iIiilIliil((class_3414)var7.method_11894().comp_349())
               )
            );
      } else if (var2 instanceof class_2675 var8) {
         class_2960 var10 = class_7923.field_41180.method_10221(var8.method_11551().method_10295());
         this.iiIlIIlIil
            .offer(
               lIliliIlil.iIlIlllllill(
                  iIilllllIlilllll.IlIiIiIill, var8.method_11544(), var8.method_11547(), var8.method_11546(), var10 == null ? "" : var10.toString()
               )
            );
      } else if (var2 instanceof class_7439 var9) {
         String var14 = var9.comp_763() == null ? "" : var9.comp_763().getString();
         if (!var14.isBlank()) {
            this.iiIlIIlIil.offer(lIliliIlil.IilliliilIIi(iIilllllIlilllll.llIiIiIill, var14));
         }

         UUID var11 = this.Illillllil(var9.comp_763());
         if (var11 != null) {
            this.iiIlIIlIil.offer(lIliliIlil.IliIlllilIi(iIilllllIlilllll.ilIiIiIill, var11, ""));
         }
      }
   }

   private void lIliliIlil() {
      this.IiIlIIlIil.iliIiiliiiii();
      this.liIlIIlIil.IilliliilIIi();
      this.iiIlIIlIil.clear();
      this.IIllIIlIil.clear();
      this.lIllIIlIil.clear();
      this.iIllIIlIil.clear();
      this.IlllIIlIil = null;
      this.llllIIlIil = null;
      this.illlIIlIil = 0;
      this.IillIIlIil = (~-1082778582 >>> 1 | ~-1082778582 << 31) ^ -1606135358;
   }
}
