package gg.corz;

import net.minecraft.class_2960;

public record liIlIliiIlIl(
   String id,
   illIIlIiIilIIlIi kind,
   String name,
   String code,
   String tagline,
   class_2960 icon,
   class_2960 padItem,
   class_2960 potion,
   class_2960 skin,
   class_2960 eyes,
   class_2960 core,
   boolean slim,
   class_2960 mainHand,
   class_2960 offHand,
   boolean planned,
   boolean glint,
   boolean villager,
   iliIIIIiIiiIIIIi act
) {
   private final class_2960 illliIllIilliIll;
   private final boolean ilIiiIllIiIiiIll;
   private final String iIIliIllIlIliIll;
   private final boolean liIiiIlliiIiiIll;
   public static final String IiliiIllliliiIll = "_eyes";
   private final class_2960 iIiliIllIliliIll;
   private final boolean IlIiiIllllIiiIll;
   private final class_2960 iiiliIllIIIiiIll;
   public static final class_2960 IliiiIlllliiiIll = class_2960.method_60656(
      lilIliilIl<"lilIliilIl","8tr7JtT096fkW558FCy+KushQSDUR4V/Q1sevsYm8rBlGyRXLa6mmA32Zk2F5b2MDdS4aJmic6X/FLc/DRf3F5c=">()
   );
   private final class_2960 lIIiiIlliIIiiIll;
   private final illIIlIiIilIIlIi llIliIllilIliIll;
   private final String IiIliIllliIliIll;
   private final class_2960 IllliIlllllliIll;
   private final String iiIliIllIIlliIll;
   public static final String iIliiIllIlliiIll = "corzclient";
   public static final String llliiIllilliiIll = "textures/bots/";
   private final iliIIIIiIiiIIIIi IIliiIlllIliiIll;
   public static final String lIiiiIlliIiiiIll = "cpx01";
   private final class_2960 IIiliIlllIiliIll;
   public static final String iiliiIllIIiiiIll = "_core";
   private final String lIlliIlliIlliIll;
   private final class_2960 lliliIllililiIll;
   private final class_2960 lilliIlliilliIll;
   private final boolean IiiliIllliiliIll;

   public boolean iIlIlllllill() {
      return this.IIliiIlllIliiIll == iliIIIIiIiiIIIIi.ilIIIIliil;
   }

   public class_2960 Illillliilli() {
      return this.IllliIlllllliIll;
   }

   public String Iiilliiliiil() {
      return this.iIIliIllIlIliIll;
   }

   public String IiIiliIiiiIi() {
      return this.iiIliIllIIlliIll;
   }

   public class_2960 Iiiiliiiiiii() {
      return this.iIiliIllIliliIll;
   }

   public String IIlilIliiIli() {
      return this.lIlliIlliIlliIll;
   }

   public class_2960 IIiilIiiiIii() {
      return this.lilliIlliilliIll;
   }

   public class_2960 IIIIllIIIl() {
      return this.lliliIllililiIll;
   }

   public liIlIliiIlIl IIillIiliIil(String icon, String potion) {
      return new liIlIliiIlIl(
         this.iIIliIllIlIliIll,
         this.llIliIllilIliIll,
         this.IiIliIllliIliIll,
         this.iiIliIllIIlliIll,
         this.lIlliIlliIlliIll,
         lIiiIiIlilli(icon),
         this.illliIllIilliIll,
         lIiiIiIlilli(potion),
         this.IIiliIlllIiliIll,
         this.iIiliIllIliliIll,
         this.lliliIllililiIll,
         this.IiiliIllliiliIll,
         this.iiiliIllIIIiiIll,
         this.lIIiiIlliIIiiIll,
         this.IlIiiIllllIiiIll,
         this.ilIiiIllIiIiiIll,
         this.liIiiIlliiIiiIll,
         this.IIliiIlllIliiIll
      );
   }

   public boolean lIlIliIlIl() {
      return this.ilIiiIllIiIiiIll;
   }

   public static liIlIliiIlIl IiIlliIliiIl(String tagline, String id, String code, String skinKey, String item) {
      class_2960 var5 = lIiiIiIlilli(item);
      return new liIlIliiIlIl(
         tagline,
         illIIlIiIilIIlIi.iIIliiiiil,
         null,
         id,
         code,
         var5,
         null,
         null,
         IilliliilIIi(skinKey),
         IilliliilIIi(skinKey + lilIliilIl<"lilIliilIl","BgloYe/lYLD/vwa2NsxQHHggnF7OJFH5jDUQ9fxOS2Fh">()),
         IilliliilIIi(skinKey + lilIliilIl<"lilIliilIl","do6nB/x6pm4go8f8txLSxDmOSNBE9pqsY+Se+h0bedYa">()),
         false,
         var5,
         null,
         false,
         false,
         false,
         iliIIIIiIiiIIIIi.ilIIIIliil
      );
   }

   public static class_2960 lIiiIiIlilli(String id) {
      return id == null ? null : class_2960.method_60654(id);
   }

   public boolean iiIIlIIlIl() {
      return this.IlIiiIllllIiiIll;
   }

   public class_2960 IiIIlliIIl() {
      return this.lIIiiIlliIIiiIll;
   }

   public boolean IllIllllIl() {
      return this.liIiiIlliiIiiIll;
   }

   public boolean iIIIlIlIIl() {
      return this.IiiliIllliiliIll;
   }

   public static liIlIliiIlIl IIIllIIliIIl(String mainHand, String tagline, String id, String code, String skinKey) {
      class_2960 var5 = lIiiIiIlilli(skinKey);
      return new liIlIliiIlIl(
         mainHand,
         illIIlIiIilIIlIi.lIIliiiiil,
         null,
         tagline,
         id,
         var5,
         null,
         null,
         IilliliilIIi(code),
         null,
         null,
         false,
         var5,
         null,
         false,
         false,
         false,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public static liIlIliiIlIl iliIiiliiiii(String code, String tagline, String offHand, String skinKey, String id, String mainHand) {
      class_2960 var6 = lIiiIiIlilli(id);
      return new liIlIliiIlIl(
         code,
         illIIlIiIilIIlIi.lIIliiiiil,
         null,
         tagline,
         offHand,
         var6,
         null,
         null,
         IilliliilIIi(skinKey),
         IilliliilIIi(skinKey + lilIliilIl<"lilIliilIl","BgloYe/lYLD/vwa2NsxQHHggnF7OJFH5jDUQ9fxOS2Fh">()),
         IilliliilIIi(skinKey + lilIliilIl<"lilIliilIl","do6nB/x6pm4go8f8txLSxDmOSNBE9pqsY+Se+h0bedYa">()),
         false,
         var6,
         lIiiIiIlilli(mainHand),
         false,
         false,
         false,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public static liIlIliiIlIl IlIlllIlilIl(String mainHand, String tagline, String skinKey, String icon, String id, String code) {
      return new liIlIliiIlIl(
         mainHand,
         illIIlIiIilIIlIi.iIIliiiiil,
         null,
         tagline,
         skinKey,
         lIiiIiIlilli(id),
         null,
         null,
         IilliliilIIi(icon),
         null,
         null,
         false,
         lIiiIiIlilli(code),
         null,
         false,
         false,
         false,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public boolean IliIlllilIi() {
      return this.IIiliIlllIiliIll != null;
   }

   public boolean liiiIIllIl() {
      return this.llIliIllilIliIll == illIIlIiIilIIlIi.lIIliiiiil;
   }

   public class_2960 Iilililiiili() {
      return this.illliIllIilliIll;
   }

   public class_2960 llIIlilIIl() {
      return this.iiiliIllIIIiiIll;
   }

   public static liIlIliiIlIl Illlllllilll(String code, String tagline, String padItem, String id) {
      class_2960 var4 = lIiiIiIlilli(id);
      return new liIlIliiIlIl(
         code,
         illIIlIiIilIIlIi.iIIliiiiil,
         null,
         tagline,
         padItem,
         var4,
         var4,
         null,
         null,
         null,
         null,
         false,
         null,
         null,
         false,
         false,
         false,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public String IlIillIiilIi() {
      return this.IiIliIllliIliIll;
   }

   public iliIIIIiIiiIIIIi illIlIilIl() {
      return this.IIliiIlllIliiIll;
   }

   public static liIlIliiIlIl IIlllIlliIll(String code, String icon, String tagline, String id) {
      return new liIlIliiIlIl(
         code,
         illIIlIiIilIIlIi.iIIliiiiil,
         null,
         icon,
         tagline,
         lIiiIiIlilli(id),
         null,
         null,
         IliiiIlllliiiIll,
         null,
         null,
         false,
         null,
         null,
         false,
         false,
         true,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public class_2960 Iliilliiilii() {
      return this.IIiliIlllIiliIll;
   }

   public liIlIliiIlIl(
      String id,
      illIIlIiIilIIlIi kind,
      String name,
      String code,
      String tagline,
      class_2960 icon,
      class_2960 padItem,
      class_2960 potion,
      class_2960 skin,
      class_2960 eyes,
      class_2960 core,
      boolean slim,
      class_2960 mainHand,
      class_2960 offHand,
      boolean planned,
      boolean glint,
      boolean villager,
      iliIIIIiIiiIIIIi act
   ) {
      this.iIIliIllIlIliIll = id;
      this.llIliIllilIliIll = kind;
      this.IiIliIllliIliIll = name;
      this.iiIliIllIIlliIll = code;
      this.lIlliIlliIlliIll = tagline;
      this.IllliIlllllliIll = icon;
      this.illliIllIilliIll = padItem;
      this.lilliIlliilliIll = potion;
      this.IIiliIlllIiliIll = skin;
      this.iIiliIllIliliIll = eyes;
      this.lliliIllililiIll = core;
      this.IiiliIllliiliIll = slim;
      this.iiiliIllIIIiiIll = mainHand;
      this.lIIiiIlliIIiiIll = offHand;
      this.IlIiiIllllIiiIll = planned;
      this.ilIiiIllIiIiiIll = glint;
      this.liIiiIlliiIiiIll = villager;
      this.IIliiIlllIliiIll = act;
   }

   public static liIlIliiIlIl Iilllilliill(String name, String tagline, String id, String code, String offHand, String mainHand) {
      class_2960 var6 = lIiiIiIlilli(offHand);
      return new liIlIliiIlIl(
         name,
         illIIlIiIilIIlIi.lIIliiiiil,
         tagline,
         id,
         code,
         var6,
         null,
         null,
         IilliliilIIi(lilIliilIl<"lilIliilIl","cDa/o8iy7tnoiF23DdBGh9qTVW4ia5JeMqkuge5YygWK">()),
         null,
         null,
         false,
         var6,
         lIiiIiIlilli(mainHand),
         true,
         false,
         false,
         iliIIIIiIiiIIIIi.llIIIIliil
      );
   }

   public illIIlIiIilIIlIi IIIilIIiiIIi() {
      return this.llIliIllilIliIll;
   }

   public liIlIliiIlIl Ililllililil() {
      return new liIlIliiIlIl(
         this.iIIliIllIlIliIll,
         this.llIliIllilIliIll,
         this.IiIliIllliIliIll,
         this.iiIliIllIIlliIll,
         this.lIlliIlliIlliIll,
         this.IllliIlllllliIll,
         this.illliIllIilliIll,
         this.lilliIlliilliIll,
         this.IIiliIlllIiliIll,
         this.iIiliIllIliliIll,
         this.lliliIllililiIll,
         this.IiiliIllliiliIll,
         this.iiiliIllIIIiiIll,
         this.lIIiiIlliIIiiIll,
         this.IlIiiIllllIiiIll,
         true,
         this.liIiiIlliiIiiIll,
         this.IIliiIlllIliiIll
      );
   }

   public static class_2960 IilliliilIIi(String key) {
      return class_2960.method_60655(
         lilIliilIl<"lilIliilIl","cBeR6OL6yCP66+Q6eMswbv+/0PqsX1HRsgmFgsXaB+7vkbaEqQQ=">(),
         lilIliilIl<"lilIliilIl","XWAMl/LMTo0UtjV+fqQnBj9IkVmw63vT+4cBDkUZUsqHyz8CGOlR7y1B">()
            + key
            + lilIliilIl<"lilIliilIl","OYlrxJjxPvhCKJTadX0Tb8Snv3gK7ApLmDM3hlK2z/A=">()
      );
   }
}
