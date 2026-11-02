package gg.corz;

import com.corz.client.mixins.AccessorClientPlayNetworkHandler;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_332;
import net.minecraft.class_5894;
import net.minecraft.class_642;
import net.minecraft.class_7439;

public final class llIIlIIiilIIlIIi extends ilIllIiIll {
   private Object liIlllliil;
   private int lliIllliil;
   private final liiIilIliiiIilIl lllIllliil;
   private lliIIIliliIIIl IIiIllliil;
   private final iIilliilIlilliil iiIlllliil;
   private Object IiIlllliil;
   private final iiIiiilIIliiil IIlIllliil;
   private final IlIiiIillIiiIi illIllliil;
   private final illlIlIlIillIlIl lIlIllliil;
   private int IlIlllliil;
   private String lIiIllliil;
   private final lliliIIiililiIIi iiIIllliil;
   static final int iIiiIlliil = 24;
   private int llIlllliil;
   private final llliliIlilliliIl IllIllliil;
   private final iiIiiilIIliiil ilIIllliil;
   private final ilIlllilIiIlllil IilIllliil;
   private volatile List<iiliIiiIIiiIii> iIiIllliil;
   static final int liliIlliil = 16;
   private final iiIiiilIIliiil llIIllliil;
   private String iiiIllliil;
   private final iiIiiilIIliiil IlIIllliil;
   private boolean iliIllliil;
   private long liiIllliil;
   private liIIiilliiIIiill iIIlllliil;
   private final iilliIlIIiliIl lIIIllliil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","fGXEH6veF3KFZA6bp9qxX62eNt0L2/0imMNOrztbHLVZKnjL8zRY">(),
      IliIlllilIi<"IliIlllilIi","uSJGyUbtWncSCKNBOOcLRGhn63nqHjri4K0wmM31C60S6e8mDQW0iWthuDJbyu2aRjU/lzJg7cxCsPnu+N1zYY537ZZnUWsQ8Rhu0L5dTo2YptAdGo30o3spk0sxRQ==">(),
      6,
      1,
      8
   );
   private int IliIllliil;
   static final long lliiIlliil = 30000L;
   private String IIIlllliil;
   private final lliliIIiililiIIi iIIIllliil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","Ssh1DtTClpBRhFtcgdct1WmRuez0qbEinpIJzknv+FM=">(),
      IliIlllilIi<"IliIlllilIi","YjHdiUrGBRY3jJNzliJ4ibGGtf5AD5ipL1NQqL4suc0qQDp0rt0ltbnohZf/KFPbhoBI8KGrhKNKCAEH6hGP/WiWugQKpcqEUpivlPeTXe4DRntq2273DSOJNxvxYV/yySCVKNQAA6A0bGcatiBSz+d1nqOZnLyzgVb13mMs2OMyT/5qdn4=">(),
      IliIlllilIi<"IliIlllilIi","W3i5q2AxFMZnnPuAWq5QmfD7p7s/iIc5qK9WUHmyUGM8r1tnIAdq">(),
      IliIlllilIi<"IliIlllilIi","W3i5q2AxFMZnnPuAWq5QmfD7p7s/iIc5qK9WUHmyUGM8r1tnIAdq">(),
      IliIlllilIi<"IliIlllilIi","sXsZo/mKhelHWKCRjlFjWxPZb2Sd6p5XpaRCz6enYtPPmOMM1U4=">()
   );
   public static volatile llIIlIIiilIIlIIi IiliIlliil;
   private final ililliIiIiilliIi iIlIllliil;
   static final String IIIIllliil = "\u00a77[\u00a7cBloodhound\u00a77]\u00a7r ";
   static final String liiiIlliil = "Sniffing for bases";
   static final int IIiiIlliil = 96;
   static final long IliiIlliil = 1500L;
   private final IIIiiiillIIiiiil lilIllliil;
   static final String iiiiIlliil = "bases4";
   static final int lIiiIlliil = 40;
   static final int iliiIlliil = 40;
   static final int iiliIlliil = 8;
   private final Map<String, lliIIIliliIIIl> iilIllliil;
   static final int IiiiIlliil = 55;
   private final lliliIIiililiIIi IiIIllliil;
   private long ilIlllliil;
   private final lliliIIiililiIIi liIIllliil;
   private String lIIlllliil;
   private boolean IiiIllliil;

   private void liilliiill(long now) {
      if (this.IiIIllliil.Ililllililil() != 2) {
         int var12 = this.ilIllIiIll();
         boolean var13 = false;

         for (iiliIiiIIiiIii var6 : this.IIiIllliil
            .IIiilIiiiIii(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321(), var12, 320)) {
            if (var6.lIiiIiIlilli() >= var12 && !var6.Illlllllilll() && var6.Ililllililil(now, 1500L)) {
               var6.Iilllilliill();
               if (!this.IIiIllliil.Illlllllilll(var6.IliIlllilIi(), var6.iIlIlllllill())) {
                  this.IIiIllliil.IIlllIlliIll((int)Math.round(var6.IliIlllilIi()), (int)Math.round(var6.iIlIlllllill()));
                  iiiIIIlIIIlIIl.liiiIIllIl();
                  double var7 = var6.IliIlllilIi() - Iiiilllliiilll.field_1724.method_23317();
                  double var9 = var6.iIlIlllllill() - Iiiilllliiilll.field_1724.method_23321();
                  String var11 = var6.IiIlliIliiIl().isEmpty()
                     ? ""
                     : IliIlllilIi<"IliIlllilIi","6nvSDoYT5wG6l7Echdh27F/lwQNv7Rq/hRhdLv2dNZk=">()
                        + String.join(IliIlllilIi<"IliIlllilIi","0gYGvNUKG1PQMc+oamP/oNC5zLKyVc9Wg9kw4Jul">(), var6.IiIlliIliiIl());
                  this.IIIillIIil(
                     IliIlllilIi<"IliIlllilIi","0KDjlduyTNf26mJ24Wxs2ey1lITzFguwyDwHR9bi7ETYEnXw">()
                        + var6.IilliliilIIi()
                        + IliIlllilIi<"IliIlllilIi","aPeZuJg0Hb6kSvVlfRtCCxRNgrnp6uUrbWEAdbNUMPO93NRi">()
                        + lilIIiiliilIIiil.IliIlllilIi(Math.sqrt(var7 * var7 + var9 * var9))
                        + IliIlllilIi<"IliIlllilIi","t5xd235I0blzRam4B+Xtem4z7iDcNk/6aT/dB8E=">()
                        + lilIIiiliilIIiil.liiiIIllIl(var7, var9)
                        + IliIlllilIi<"IliIlllilIi","GHe0aAWKqzI8w5ll9lk+LWFKp8kTogOmUhKYTeXlVFOJ8Iw=">()
                        + lilIIiiliilIIiil.iIlIlllllill(var6.IliIlllilIi(), var6.liiiIIllIl(), var6.iIlIlllllill())
                        + IliIlllilIi<"IliIlllilIi","m+4a8iHPaxWx7AOjGlkIhTLc4VjwXgs3oYzAvlnQHg==">()
                        + var11
                  );
                  if (this.IiIIllliil.Ililllililil() == 0 && !var13) {
                     IilIlllilIll.IliIlllilIi();
                     var13 = true;
                  }
               }
            }
         }
      } else {
         for (iiliIiiIIiiIii var4 : this.IIiIllliil
            .IIiilIiiiIii(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321(), this.ilIllIiIll(), 320)) {
            var4.Iilllilliill();
         }
      }
   }

   public List<iiliIiiIIiiIii> liIlliiIll() {
      return this.iIiIllliil;
   }

   @Override
   protected void Illillliilli() {
      this.IllIllliil.IliIlllilIi();
      this.illIllliil.IliIlllilIi();
      this.lilIllliil.IliIlllilIi();
      this.IliIllliil = 0;
      this.lIiIllliil = null;
      this.lliIllliil = 0;
      this.iliIllliil = Iiiilllliiilll != null && Iiiilllliiilll.field_1687 != null;
      this.IiIlllliil = null;
      this.lllIllliil.IliIlllilIi();
      this.iiiIllliil = IliIlllilIi<"IliIlllilIi","DRKE2x6ALIXcK3wuiqnJ3EZDnJ9U/YPNJ7HG2UmuqIHHHR4qxZXS4pNYBqnoJA==">();
      this.IIIlllliil = "";
      this.lIIlllliil = null;
      this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
      this.IlIlllliil = 0;
      this.llIlllliil = 0;
      this.ilIlllliil = 6466885317758167369L ^ -2756486719096608439L;
   }

   public int ilIllIiIll() {
      return ~(925089666 ^ 113) ^ -925089733;
   }

   public void iIIilIlIil(class_332 ctx) {
      if (ctx != null && Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1690.field_1842 && this.ilIIllliil.Iilllilliill()) {
         this.lilIllliil.liiiIIllIl(ctx, this.iIIlllliil, this.iiiIllliil, this.IlIlllliil, this.llIlllliil, this.IllIllliil.iIlIlllllill(), null);
      }
   }

   private void iilllIIill(long now) {
      long var4 = 19166187979959672L;
      var4 ^= ((long)this.liIIllliil.Ililllililil() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != this.lliIllliil) {
         this.lliIllliil = (int)(var4 >>> 32);
         if ((int)(var4 >>> 32) == 0) {
            this.iiIlllliil.iliIiiliiiii(IliIlllilIi<"IliIlllilIi","xvdHbqNGGnppocOjTn4acfQFyg5DsuH35B1QxDw8gwNISAnfKLqfJY8=">());
         } else {
            this.iiIlllliil.lIiiIiIlilli(IIIIiIIllIIIiIIl.values()[(int)(var4 >>> 32)], Iiiilllliiilll, this.lIilliIill(), now);
         }
      }

      this.iiIlllliil.IIlllIlliIll(Iiiilllliiilll, now);
      if (this.lliIllliil != 0 && this.iiIlllliil.IliIlllilIi() == IIIIiIIllIIIiIIl.iiIlIIilIl) {
         this.lliIllliil = 0;
         this.liIIllliil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">());
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiIlllliil
         .iliIiiliiiii(
            this.iiIlllliil.IliIlllilIi() == IIIIiIIllIIIiIIl.iiIlIIilIl
               ? null
               : IliIlllilIi<"IliIlllilIi","xvdHbqNGGnppocOjTn4acfQFyg5DsuH35B1QxDw8gwNISAnfKLqfJY8=">()
         );
      this.lliIllliil = 0;
      if (this.liIIllliil.Ililllililil() != 0) {
         this.liIIllliil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">());
      }

      this.illIllliil.IliIlllilIi();
      this.iIiIllliil = List.of();
      if (this.IiiIllliil) {
         this.IiiIllliil = false;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public int lIIlliIIll() {
      return (1658718566 >>> 27 | 1658718566 << 5) - 69 ^ 1539386543;
   }

   private void iIlllIllll() {
      this.IIiIllliil.IilliliilIIi();
      iiiIIIlIIIlIIl.liiiIIllIl();
      this.IllIllliil.IliIlllilIi();
      this.iIiIllliil = List.of();
      this.IIIillIIil(IliIlllilIi<"IliIlllilIi","lJ2TIGlWtAB8gNTjC+wkK5QvmsP6dgK2A6FTqECLSWe7Xn6CaYEn2Auz2FdjNnT0f3fp+0nV98jFUTV8">());
   }

   private void lllllillll(long now) {
      for (iiliIiiIIiiIii var4 : this.IIiIllliil.iIlIlllllill()) {
         if (var4.IIillIiliIil(40)) {
            this.IiiIllliil = true;
         }
      }

      if (this.IiiIllliil && now - this.liiIllliil >= 30000L) {
         this.IiiIllliil = false;
         this.liiIllliil = now;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public static void iiiIlIIIll(class_2338 newState, class_2680 oldState, class_2680 pos) {
      llIIlIIiilIIlIIi var3 = IiliIlliil;
      if (var3 != null && var3.IliIlllilIi()) {
         var3.IllIllliil.lIiiIiIlilli(newState, oldState, pos);
      }
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      this.illIllliil.liiiIIllIl(event.iilIIiiIll);
      if (event.iilIIiiIll instanceof class_7439 var2 && var2.comp_763() != null) {
         this.iiIlllliil.IilliliilIIi(var2.comp_763().getString());
         return;
      }

      if (event.iilIIiiIll instanceof class_5894 var3 && var3.comp_2279() != null) {
         this.iiIlllliil.IilliliilIIi(var3.comp_2279().getString());
      }
   }

   @Override
   protected void lilIliilIl(IiiIlllliiIlll e) {
      if (e.liiiIIllIl() == ((-(~1235203442) << 1 | -(~1235203442) >>> 31) ^ -1824560409)
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1755 == null) {
         if (this.lIlIllliil.IiIiliIiiiIi(e.IliIlllilIi())) {
            List var2 = this.iIiIllliil;
            if (var2.isEmpty()) {
               this.IIIillIIil(IliIlllilIi<"IliIlllilIi","WOt4ANi/mC+4lcKomUY0sp8LfYC4eilPsUr/2dlZ8So0UiWOBI4W/ayzMbgZmS4fw0c=">());
            } else {
               if (this.iiIlllliil.IliIlllilIi() != IIIIiIIllIIIiIIl.iiIlIIilIl) {
                  this.iiIlllliil.iliIiiliiiii(null);
                  this.lliIllliil = 0;
                  this.liIIllliil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">());
                  this.IIIillIIil(IliIlllilIi<"IliIlllilIi","xvdHbqNGGnppocOjTn4acfQFyg5DsuH35B1QxDw8gwNISAnfKLqfJY8=">());
               }

               iiliIiiIIiiIii var3 = (iiliIiiIIiiIii)var2.get(0);
               if (iIilliilIlilliil.IIiilIiiiIii(Iiiilllliiilll, var3.IliIlllilIi(), var3.iIlIlllllill())) {
                  this.IIIillIIil(
                     IliIlllilIi<"IliIlllilIi","qatYA/1gZWjAfgj96zGs7FMGI4AhR8WGnadj9ibnv1VN93sdUKcVYL+P9m97HjF3doP3iY8=">()
                        + var3.IilliliilIIi()
                        + IliIlllilIi<"IliIlllilIi","H8Aqr2TQr2s9JE2JMySHyS6tF6vaS+lzBCHeeRf7CnWDKg==">()
                        + lilIIiiliilIIiil.iIlIlllllill(var3.IliIlllilIi(), var3.liiiIIllIl(), var3.iIlIlllllill())
                        + IliIlllilIi<"IliIlllilIi","Erfr/vUwX193jRSoaebpscDxx0fLwz6lZRzld7g=">()
                  );
               } else {
                  this.IIIillIIil(
                     IliIlllilIi<"IliIlllilIi","sAnDwLPIPkSkyk2axGkc/djvT8PNO1sWAfma3FI0ejUc41UyDpIiFFDiS8Sf6AnlKUZrNUTXcNebhEf3CvAwPuC9dvwD6UtO6ffDwabGAsggE9a2+MB3ITZ/mbqd">()
                  );
               }
            }
         }
      }
   }

   private String ilillIiill() {
      try {
         if (Iiiilllliiilll.method_1576() != null) {
            return IliIlllilIi<"IliIlllilIi","QpHC1OI1APfHuzzpsBaYWkhe6dNEixQKhoa3zo0tP7+0Yg==">() + Iiiilllliiilll.method_1576().method_27728().method_150();
         }
      } catch (Throwable var2) {
      }

      return IliIlllilIi<"IliIlllilIi","S+QhGAck4XCsv3Zrrv2QrKJtVruKNq/c/y7fyDCrkrp2">();
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<"IliIlllilIi","4cK64NX50LTPhi29PbUM664E6iuBZWd1MVOU+s0qQj82Mg==">())
            && var2.get(IliIlllilIi<"IliIlllilIi","4cK64NX50LTPhi29PbUM664E6iuBZWd1MVOU+s0qQj82Mg==">()).isJsonObject()) {
            long var3 = System.currentTimeMillis();
            ArrayList var5 = new ArrayList();

            for (Entry var7 : var2.getAsJsonObject(IliIlllilIi<"IliIlllilIi","4cK64NX50LTPhi29PbUM664E6iuBZWd1MVOU+s0qQj82Mg==">()).entrySet()) {
               if (((JsonElement)var7.getValue()).isJsonArray()) {
                  var5.add(var7);
                  if (var5.size() >= 24) {
                     break;
                  }
               }
            }

            Collections.reverse(var5);

            for (Entry var16 : var5) {
               lliIIIliliIIIl var8 = this.iilIllliil.computeIfAbsent((String)var16.getKey(), k -> new lliIIIliliIIIl());
               int var9 = 0;

               for (JsonElement var11 : ((JsonElement)var16.getValue()).getAsJsonArray()) {
                  if (var9++ >= 96) {
                     break;
                  }

                  try {
                     JsonArray var12 = var11.getAsJsonArray();
                     String var13 = var12.size() > 4 ? var12.get(4).getAsString() : "";
                     var8.IiIlliIliiIl(
                        var12.get(0).getAsInt(),
                        var12.get(1).getAsInt(),
                        var12.get(2).getAsInt(),
                        var12.get(3).getAsInt(),
                        var13.isBlank()
                           ? List.of()
                           : List.of(var13.split(Pattern.quote(IliIlllilIi<"IliIlllilIi","R+rQyZNVHQeXv6EE4koy1zpXlgk9ZiDe3hPxBHY=">()))),
                        var12.size() > 5 ? var12.get(5).getAsLong() : var3,
                        var3
                     );
                  } catch (Throwable var14) {
                  }
               }

               var8.Ililllililil(var3, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      int var2 = 0;
      ArrayList var3 = new ArrayList<>(this.iilIllliil.entrySet());
      Collections.reverse(var3);
      var3.sort((a, b) -> Boolean.compare(!((String)a.getKey()).equals(this.lIiIllliil), !((String)b.getKey()).equals(this.lIiIllliil)));

      for (Entry var5 : var3) {
         JsonArray var6 = new JsonArray();

         for (iiliIiiIIiiIii var8 : ((lliIIIliliIIIl)var5.getValue()).Iilllilliill(40, 96)) {
            int var9 = Math.min(var8.IilliliilIIi(), Math.max(var8.iliIiiliiiii(), var8.IlIlllIlilIl(lIiiIlliIiiIll.liIIllliliiIIlllil)));
            if (var9 >= 40) {
               JsonArray var10 = new JsonArray();
               var10.add((int)Math.round(var8.IliIlllilIi()));
               var10.add((int)Math.round(var8.liiiIIllIl()));
               var10.add((int)Math.round(var8.iIlIlllllill()));
               var10.add(var9);
               var10.add(String.join(IliIlllilIi<"IliIlllilIi","R+rQyZNVHQeXv6EE4koy1zpXlgk9ZiDe3hPxBHY=">(), var8.IIlllIlliIll()));
               var10.add(var8.Iiilliiliiil());
               var6.add(var10);
            }
         }

         if (!var6.isEmpty()) {
            if (++var2 > 24) {
               break;
            }

            var1.add((String)var5.getKey(), var6);
         }
      }

      if (var1.isEmpty()) {
         return null;
      } else {
         JsonObject var11 = new JsonObject();
         var11.add(IliIlllilIi<"IliIlllilIi","4cK64NX50LTPhi29PbUM664E6iuBZWd1MVOU+s0qQj82Mg==">(), var1);
         return var11;
      }
   }

   public llIIlIIiilIIlIIi() {
      super(IliIlllilIi<"IliIlllilIi","kE2Fwvf41OJvpXBSrNO3E0LViv9Hia96upO9KIozlsulHXpr8jI=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIIllliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","7kz2i2o6RpKL37KPtL2cZM10AVydO2tG4XNPQoDWkGB6DGFr7g==">(),
         IliIlllilIi<"IliIlllilIi","WzSe8elP6X4gRbNLi3xmTMZjAfIlC+BTLjV694GCk5Qvsi77+l2jLDWYIrUE7S5XYA/RwhoSa8/eG32FbhZAZpwnlExcwiHHIJnAFg==">(),
         true
      );
      this.llIIllliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","YxE5SRgfXyZCkFbnFBYSOnluFEZ8y9HjlgPKJ697edJRfuL0K8Lx+w==">(),
         IliIlllilIi<"IliIlllilIi","Gf5eLB9VTS8dbXRwfXuMrifCKgIh9e3hq20d+9zcUdrtm1pX+QRILYRxEWk7z/oZyyzaPWazgNpBBaBBUwxfd+cD1XUU7hLSzdc=">(),
         true
      );
      this.ilIIllliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","HgGGkNUTm+FE7cc7hpXn7/4P0niY8NEjLpkfBH1ImEhB8cmnjSEl">(),
         IliIlllilIi<"IliIlllilIi","ENduBdu/+XabdTbcIzXPmoyI2n6INkiXukek8V39n9/RZPYveheD7SX3S7gk+pRkTQDEv8P2ONqrBP6Wq0sGR2CrYt0+LiFsOhAQjSO1is5yziPGKg==">(),
         true
      );
      this.IiIIllliil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","EiGLYjzKtRyGo4Nm5+5rE2wDU2pN9GQr/vQXW+/vJtOTgg==">(),
         IliIlllilIi<"IliIlllilIi","O46KtjmaTKamQy5SYVUkQRYQe4FDTYh6sBSmXFv9yqDkEqAdbGGiX62mriUsrMfMNSW9NV8Vv2U5QR+iCuCGa36uvjPt1kafgi/BsMyZSqJ7bghr9e+Ebw==">(),
         IliIlllilIi<"IliIlllilIi","xOghvowV9F2mNPxX22XlGhAbhVFhrXhCZcvhgOjEboVJjmeiGAIqXA==">(),
         IliIlllilIi<"IliIlllilIi","xOghvowV9F2mNPxX22XlGhAbhVFhrXhCZcvhgOjEboVJjmeiGAIqXA==">(),
         IliIlllilIi<"IliIlllilIi","GMtJhswjEO0onZibXM+3UrsoMrOBn4B8+9tPluuX/2A=">(),
         IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">()
      );
      this.liIIllliil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","9657JpMzp6rjdZHJa7qXBEwVyLOlpwPAsZBYQgZxFoU=">(),
         IliIlllilIi<"IliIlllilIi","ib3IiD8Oj/KoZ4ta6JXXqxjfMBC/YRLx85Acd5gyI5pXexNIhYoyoLiEmd0/c/MaXqM+WjSxDjq2Qoc6nl5pVCHUgMbhEUVm5rh1IkGTgfopw57RDb9D7ASAMGiKT6j1ARtytrrucaq2IkAjXy8akfirdB8ImTml6qS2tHy0G0PcNIC8vA==">(),
         IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">(),
         IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">(),
         IliIlllilIi<"IliIlllilIi","IXbHe+Ovg8oCAdZjWGi112EQPlDyzT8pRc5+W13XMg==">(),
         IliIlllilIi<"IliIlllilIi","DghcD+Ded+agtGiJydM9Jly5VkenoqeTGGLA6uz4rUVpvg==">()
      );
      this.iiIIllliil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","K8+cRJqybajpnDCWSWFVfvVYVVEE08uPmuMSLtxznsIJgiEgg8I=">(),
         IliIlllilIi<"IliIlllilIi","6TaI09Xore5qwyoQ2CLgY0dm84Wfkpfg1V81edyCrxJDZhURcN0EUrMUESnL+1noneW8C1RrANCS+zwYl/dqltJAo6U7IU2RjBFH74emke5Ttr0U4nImsWXS0lftWQ==">(),
         IliIlllilIi<"IliIlllilIi","6bM7Jg5oDMX8FSigft3baZgCBHvfcTiaxDv6zeY/Hm5CoA==">(),
         iiiIIIIlIIIlIIIl.iIiIliIlIl.toArray(new String[0])
      );
      this.IIlIllliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","HdkFWOvdiP7M9n6+E3JfPJ9972dvIbBEo0i0q7tiuVf+dMGePizeSF58ew==">(),
         IliIlllilIi<"IliIlllilIi","NP4OEX2yEUW3N+jOEXAUPsGjjfFtaiqsw5rwCSi1Wj1ueiwlRg2Zax/2q/8mE7NM0W1D02/yiR2nkLEQyiPiw8dsFEH8iSuML7yCkli6ccFSRbbEd8A8ET2Ao3SDICHhwjE8HsqNbmTq">(),
         true
      );
      this.lIlIllliil = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","i5obQoLFMoY8yckPHhSSws0MIV5MY+M2KZAvlLrlR0CBKZS7TBeB">(),
         IliIlllilIi<"IliIlllilIi","jOmYf9u4P7qiYUCw4yMkf3jVrevRa5IGFtmH289MgGz2r+O5knqW/IrJnGWbDmkf5dX+oU6ieEyMw1oHDLSZEE+uUc30HkfijArp3pgFhl4=">()
      );
      this.iIlIllliil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","0FgVea/hD9Li/LTI/YcjJC7AuSkwvKeItNwkN25v8Dt/WVABNOEZ">(),
         IliIlllilIi<"IliIlllilIi","UQGm5E5saiWF5AkNf0dNApSJAsVEKg4RmlFH2e/P4+uwScItmXsuCGAyzFic8za6fJxcsgZdeM5+yzririWq/8lX7J6rZ8EsYg==">(),
         IliIlllilIi<"IliIlllilIi","VCDJr3rXpUVz0svwHq1HIogtoguzOJrK9xACiWZn6gQp">(),
         this::iIlllIllll
      );
      this.IllIllliil = new llliliIlilliliIl();
      this.lllIllliil = new liiIilIliiiIilIl();
      this.illIllliil = new IlIiiIillIiiIi();
      this.IilIllliil = new ilIlllilIiIlllil();
      this.lilIllliil = new IIIiiiillIIiiiil();
      this.iilIllliil = new LinkedHashMap<>(16, 0.75F, true);
      this.IIiIllliil = new lliIIIliliIIIl();
      this.iIiIllliil = List.of();
      this.iiiIllliil = IliIlllilIi<"IliIlllilIi","DRKE2x6ALIXcK3wuiqnJ3EZDnJ9U/YPNJ7HG2UmuqIHHHR4qxZXS4pNYBqnoJA==">();
      this.IIIlllliil = "";
      this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
      this.ilIlllliil = Long.MIN_VALUE;
      this.iiIlllliil = new iIilliilIlilliil(new liiilllliiiillll() {
         @Override
         public boolean iIlIlllllill() {
            return llIIlIIiilIIlIIi.this.IIlIllliil.Iilllilliill();
         }

         @Override
         public lliIIIliliIIIl IliIlllilIi() {
            return llIIlIIiilIIlIIi.this.IIiIllliil;
         }

         @Override
         public void IIIllIIliIIl(String msg) {
            llIIlIIiilIIlIIi.this.IIIillIIil(msg);
         }

         @Override
         public String IilliliilIIi() {
            return llIIlIIiilIIlIIi.this.iiIIllliil.Iilllilliill();
         }

         @Override
         public boolean iliIiiliiiii(long ms) {
            return llIIlIIiilIIlIIi.this.IllIllliil.IilliliilIIi(ms);
         }

         @Override
         public int liiiIIllIl() {
            return llIIlIIiilIIlIIi.this.ilIllIiIll();
         }

         @Override
         public int lIiiIiIlilli() {
            return llIIlIIiilIIlIIi.this.IllIllliil.liiiIIllIl();
         }
      });
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lIIIllliil,
            this.iIIIllliil,
            this.IlIIllliil,
            this.llIIllliil,
            this.ilIIllliil,
            this.IiIIllliil,
            this.liIIllliil,
            this.iiIIllliil,
            this.IIlIllliil,
            this.lIlIllliil,
            this.iIlIllliil
         }
      );
      IiliIlliil = this;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.IlIIllliil.Iilllilliill() || this.llIIllliil.Iilllilliill()) {
         this.IilIllliil.iIlIlllllill(this.iIiIllliil, this.IlIIllliil.Iilllilliill(), this.llIIllliil.Iilllilliill());
      }
   }

   boolean IlIllllIll() {
      return this.iIIIllliil.Ililllililil() == 0;
   }

   private int lIilliIill() {
      long var4 = 8725492531954528646L;
      var4 ^= ((long)Iiiilllliiilll.field_1690.method_38521() << 32 ^ var4) & -1L << 32;

      try {
         if (Iiiilllliiilll.method_1562() instanceof AccessorClientPlayNetworkHandler var2 && var2.getChunkLoadDistance() > 0) {
            var4 ^= ((long)var2.getChunkLoadDistance() << 32 ^ var4) & -1L << 32;
         }
      } catch (Throwable var6) {
      }

      return Math.max(2, Math.min(~(-2115209237 + -77) + -103 ^ 2115209194, (int)(var4 >>> 32)));
   }

   public lliIIIliliIIIl IIllllIlll() {
      return this.IIiIllliil;
   }

   private void IIIillIIil(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724
            .method_7353(
               class_2561.method_43470(IliIlllilIi<"IliIlllilIi","M9q9bRxUFaMulAs4RAjlZXCclL8Pxh/H+ncuXQbEGBwivNIq3fQYNiOHWmzuDuGh7um6yeE=">() + msg), false
            );
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1690.field_1842) {
         if (this.IlIIllliil.Iilllilliill()) {
            this.IilIllliil.IilliliilIIi(event.IIiIilIIIl, this.iIiIllliil);
         }

         if (Iiiilllliiilll.field_1755 == null) {
            this.iIIilIlIil(event.IIiIilIIIl);
         }
      }
   }

   private String Ilillllill() {
      class_642 var1 = Iiiilllliiilll.method_1558();
      String var2 = var1 != null ? var1.field_3761 : this.ilillIiill();
      return var2 + IliIlllilIi<"IliIlllilIi","R+rQyZNVHQeXv6EE4koy1zpXlgk9ZiDe3hPxBHY=">() + Iiiilllliiilll.field_1687.method_27983().method_29177();
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2535 var1 = Iiiilllliiilll.method_1562() == null ? null : Iiiilllliiilll.method_1562().method_48296();
         boolean var2 = this.IiIlllliil != null && var1 != this.IiIlllliil;
         this.IiIlllliil = var1;
         boolean var3 = this.liIlllliil != null && Iiiilllliiilll.field_1687 != this.liIlllliil;
         this.liIlllliil = Iiiilllliiilll.field_1687;
         String var4 = this.Ilillllill();
         if (!var4.equals(this.lIiIllliil) || var2) {
            boolean var5 = this.lIiIllliil == null;
            this.lIiIllliil = var4;
            if (!var5 || !this.iliIllliil || var2) {
               this.iiIlllliil.iliIiiliiiii(null);
               this.lliIllliil = 0;
               if (this.liIIllliil.Ililllililil() != 0) {
                  this.liIIllliil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VOcqiIgxuB+3W3Kg7pc4u4qcXGJXhpf0ZCcOcTOONQ==">());
               }
            }

            this.iliIllliil = false;
            this.IIiIllliil = this.iilIllliil.computeIfAbsent(var4, k -> new lliIIIliliIIIl());
            this.IllIllliil.IliIlllilIi();
            this.illIllliil.IliIlllilIi();
            this.lllIllliil.IliIlllilIi();
            this.iIiIllliil = List.of();
         } else if (var3) {
            this.IllIllliil.IliIlllilIi();
            this.illIllliil.IliIlllilIi();
            this.lllIllliil.IliIlllilIi();
         }

         long var9 = System.currentTimeMillis();
         int var7 = Iiiilllliiilll.field_1724.method_31477() >> 4;
         int var8 = Iiiilllliiilll.field_1724.method_31479() >> 4;
         this.IllIllliil
            .iliIiiliiiii(Iiiilllliiilll.field_1687, var7, var8, this.lIilliIill(), this.IIiIllliil, this.lIIIllliil.Iilllilliill(), this.IlIllllIll(), var9);
         this.illIllliil.IIIllIIliIIl(Iiiilllliiilll.field_1687, Iiiilllliiilll.field_1724, this.IIiIllliil, var9);
         this.IliIllliil++;
         this.iilllIIill(var9);
         if (this.IliIllliil % 20 == 0) {
            this.lllIllliil
               .liiiIIllIl(
                  Iiiilllliiilll.field_1687,
                  Iiiilllliiilll.field_1724,
                  this.IIiIllliil,
                  Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25181,
                  this.IlIllllIll(),
                  var9
               );
         }

         if (this.IliIllliil % 10 == 0) {
            this.IIiIllliil.Ililllililil(var9, Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321());
            this.iIiIllliil = this.IIiIllliil
               .Iiiiliiiiiii(
                  Iiiilllliiilll.field_1724.method_23317(),
                  Iiiilllliiilll.field_1724.method_23321(),
                  this.lIIlliIIll(),
                  8,
                  Math.max(1024.0, (double)this.lIilliIill() * 32.0),
                  2,
                  this.IlIllllIll() && Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25179 ? 0 : Integer.MAX_VALUE
               );
            this.liilliiill(var9);
            this.lllllillll(var9);
         }

         if (this.ilIIllliil.Iilllilliill()) {
            this.Iillllilll();
         }
      }
   }

   private void Iillllilll() {
      List var1 = this.iIiIllliil;
      iiliIiiIIiiIii var2 = var1.isEmpty() ? null : (iiliIiiIIiiIii)var1.get(0);
      this.IlIlllliil = var1.size();
      this.llIlllliil = var2 == null ? 0 : var2.IilliliilIIi();
      double var3 = var2 == null ? 0.0 : var2.IliIlllilIi() - Iiiilllliiilll.field_1724.method_23317();
      double var5 = var2 == null ? 0.0 : var2.iIlIlllllill() - Iiiilllliiilll.field_1724.method_23321();
      double var7 = Math.sqrt(var3 * var3 + var5 * var5);
      boolean var9 = var2 != null && var2.lIiiIiIlilli() >= this.ilIllIiIll();
      String var10 = this.iiIlllliil.iIlIlllllill();
      if (!this.iiIlllliil.liiiIIllIl() || var10.isEmpty() || var9 && var7 <= 320.0) {
         this.IIIlllliil = "";
         if (var2 == null) {
            this.iiiIllliil = IliIlllilIi<"IliIlllilIi","DRKE2x6ALIXcK3wuiqnJ3EZDnJ9U/YPNJ7HG2UmuqIHHHR4qxZXS4pNYBqnoJA==">();
            this.ilIlllliil = Long.MIN_VALUE;
            this.iIIlllliil = liIIiilliiIIiill.iiIIiliill;
         } else {
            String var11 = lilIIiiliilIIiil.liiiIIllIl(var3, var5);
            long var12 = (long)var2.IilliliilIIi() << 32 | (var7 < 1000.0 ? Math.round(var7) : 1000000L + Math.round(var7 / 100.0));
            if (var12 != this.ilIlllliil || !var11.equals(this.lIIlllliil)) {
               this.ilIlllliil = var12;
               this.lIIlllliil = var11;
               this.iiiIllliil = IliIlllilIi<"IliIlllilIi","BGLWbc11gfjgmIiQvHyhgZ32T3I/yGvwezAfb3ohoZgt">()
                  + var2.IilliliilIIi()
                  + IliIlllilIi<"IliIlllilIi","O/+ixvQRa+48ciE7xY9jocYYcZgXqIwcrpQsZB9GBrcX">()
                  + lilIIiiliilIIiil.IliIlllilIi(var7)
                  + IliIlllilIi<"IliIlllilIi","t5xd235I0blzRam4B+Xtem4z7iDcNk/6aT/dB8E=">()
                  + var11;
            }

            this.iIIlllliil = var9 ? liIIiilliiIIiill.IIlIiliill : liIIiilliiIIiill.lIlIiliill;
         }
      } else {
         if (!var10.equals(this.IIIlllliil)) {
            this.IIIlllliil = var10;
            this.iiiIllliil = IliIlllilIi<"IliIlllilIi","Lvm5G5J7CJIcwd1XCsI+AFP4aq3H8Sa0uzlo+h2CRAfH7w5ki4T8">() + var10;
         }

         this.ilIlllliil = Long.MIN_VALUE;
         this.iIIlllliil = liIIiilliiIIiill.IIlIiliill;
      }
   }
}
