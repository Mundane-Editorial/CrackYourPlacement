package Day_3;

public class valid_palindrome_II_680 {
    public static void main(String args[]){
        String s = "lyjcyxwvartqrbmqpddmushqkalgywgsialtbfysqkmbobaujedobhsmauazbhdsilqkkjuzoqimfqwmfoqeiovstodqqsiyj"+
                "bkbtshhjsalmbxqaacjmnijyfrwtvqfischpkcrwtozbiwrfvuggqdcinfhhyohizalbzjppztabikdnznbhyolevzutydrbxirj"+
                "zltcpdglzjtyblflqjkolxymkvdfyqrfbhgwqsnzhuqxfcttlwjigbtennfvbxplzmxdheiaulyhzztwbhtsemruznnqzborldvd"+
                "fpfjyraxuhceuklfxilxtljyytriyhezhjklykkkijjzquapufkrlsiovnkozlxkjnahpiulsrmykcqavrlriknuoxtdzpzddukf"+
                "qmyvppndgjvcbuaskqsppsxbhchmtgxqklivlqbmscowxndgxcubnvymipsxohtrmtjyexbmslhhmqklrfvrdimcxykvgvkfocigj"+
                "imkafxeevdetqjscgqewhaukixtxiivzsklpzcscxgzdlfqjmpkxegtbejckitubhugylihvoqximedxuujhsyzclyyrnvzptfrdh"+
                "dmocxhgpwjxpxkbougrwwwhkfddyxnvawdirsrydkqstalyqpokivlcwxtmviakkwaqmwguasmmujfrxbhmckhgfwcsghuxcprqaw"+
                "xggdfpegfvolhenffubhsprjbpzkoxzksdyrajrtzmqwvcjvdzthzhwrmdqdmbnqxqibnfwpqbouophshrrbytfaroltdsfrmrnzr"+
                "tlxskwfbxmieqyrlnpluohqafnfpfgrwjmmnzrgzdlzannsjxvoaxanzlldbrivsesecrdfttvaxsplisqjrsrklmfbtfejpftfxk"+
                "dgvvdowlpwcafjzxsiwwgbtiphyrqbnjhyrioyaxucxndjwjhjjozdplbljuoizgxwzrydoptnwfminobnwhnearuhhommwxfnzvym"+
                "bupowhsvvxsyxfldgwheacxksspkeiyrdlwrbktiwuydxqkfpdbsnggwuyfyigpbakxohotqbidrmjsldrpklozbifpcyxismcefvd"+
                "wxunahkfujenaknczawlcvdfeazizsfzunozorctpdrzczwwdwcdmfhjsmfwjfqihwslydaghcccxvbntdrxkzyohrpgxcjxixdhpk"+
                "jzsrqwsquauoqdtprdqrfajaqtzyzpussttzfaepgmgjvjvoopvntctdrddsaammvgcehmprmtzumifgjbzvpzprlepczdmwwdrrtv"+
                "whhnjatzswboekiajtspxcjgcgviewevutoxvrybxknptsnuysvwccdfmrxjuvptyamcckubbdptpzgaysbzsztjzwtcloqeyvosgm"+
                "bpfgzbcdouiqfffwfuiawkzkodgckjwkvyuitmqixrjehzdksniqpsrigosupxkkluoiimdzyyhxvsffbkkhdaaxfoiatzsrtbnpg"+
                "qnrfbosaymnpwmihoctrypveiuxcwtbodtggqxgyhhwtyknhruyhclssxlcmcabshajvtxurrrykkyalhdhbdwvjjhsejlqvnctix"+
                "nzvukalkphvlwvmcqjeytpwbahfscydpjgcoxjcniptpobbuqirmhcjcesdhgwllnzyjrriduyyaogpqyxuhcvsvrxpvupmbczimx"+
                "fggplguslywqjhyjyckwjbycbyhyaanuatlezcoiampqwtcgtrssnuhrzhlmuuczbernacccvtcjkzwhrptmzdxquqjvmxqzrvklu"+
                "hrjekknzmqogbhzhzduvtndyqojylugcqnbjomsyiipsfhiflcnjzgfzkgsdbtqsuzdzjiykxfdjnzgdvcppiqlfmxurhldpcuhx"+
                "bqytoizqdenexbtsztisrzsokuktzsqvooysvuqwijuxqyzguqnszumukgawzyogkxvkjsjttsjgnaftbgjqdwkjbrpqylyemnqcd"+
                "llndevrcpmiwsuiipzjnipjbxfkdffmthhlkpqewukaxgworxcfwmlhothsgvhvwgfnpdvsxclprpnsnaiorttjfpiiufgagfbmif"+
                "fgeikdarhubuaezjuqvgksbeiajjffbztzopyhvjoieduxqodqghkigskimdabcyhlqxxyaemhpriklpqmlbjocmklswahpwgwgzd"+
                "ludqvpiegwguznpclsucuqkvsawdbttfowetonjfjqnjvzdhfuqfpjmxynimnfxuygsztbortaxhxxwyzjwqszresyotfqdrcmwhr"+
                "dsuelbxobqtnukazqikeijaispuhqpquexbwycxbzvbdbzczhdbrksibjikghthjjswuionrmarutnxqoserlkzioyssxpqhlqwzt"+
                "fvslsoaidgrahfvlvawegcajryevlqhapdfwyllaljqpzgqhjkozturndcksqieawyeazmmdxjcbfdobylfrudnxhlqvsmxyyieha"+
                "uwvoqfpcuamknhbxgznwgnpggzkolpgfrcouxakuxyqbnzfwiiwdpqognpvksrfwajycyikjhharxlvummqjbduynuaghwvtdeqcb"+
                "bexzmnyrzxorubfgcbzisaqnejyxxvaxrqxpfnyqyiqdwjaqobzthoxxvcjuwygbqjpaaverwmqmwcqkwrygapuiozsbkyeltsfbq"+
                "ylmbjeirpcmlwupdssmxvwadjxuwjoeeurakjeoqqosojuudzmclnskioxburoijftgbroznqplgddejuyrwcptkoyuqlecohsaft"+
                "cgkorupqwvmadhemtgbqxwdcnoiobhtuffohsirgybmattgqkxdrtlssddwomxlxrpmsnhygfsyrjioxuurbkupzljrkgkytvzwpj"+
                "vntqbzowctwjuhvsrzercfblafwcincdfucuwuynvwsxnxqdoqgskeujobuevkcsllfzcaypzfgrtzisouslkaohmoqzcmdzdrjcn"+
                "asnazpaugxpmtaqewqxqwmqlqrmyyigqrlzczogzfaqnrgisnldfvhjvdpdlgjltsnfxopcluaqlplrdurnkffyfbyuaqwybeaebm"+
                "htlnordnvuuyjiukyknpxvamrqqqvlwzgouilfhhzekvgkqmsqhdqikddkwemlqfydfvkyicbmgnwxccmnbzphghoolhazupawvdw"+
                "plphojedprkpmstcttuaqhxlxhyfziqwvnigwdmtuwutpfqbjmsqjzhomqltlrkavlvueusktbmmouqckzkejcyerrhjbodozzhdx"+
                "tglaoptpchhdjnoyvtpdsumbrbppchssqbzbqqcsedqtqwhndxrgmyrhyfgzwkbgamfiqcmbcqqclrjvonrsobujtaoridmcrhowy"+
                "kivrhoywffjwpcohahixfwcqrgocsokorujsnveplxqksjytomxmxrlmtzbrjgmnmfzsziosxzhpkygfueazbfhypxqbssthyluex"+
                "vwvprrickierqmatzimsvrppiibhiwfapptkwbcsjtzbsboabfvhyokdqsigfslwppaabuevsqqamshzzczhyipgiuitoluzgqwwc"+
                "xnwquwumctqctkxvniathxwulblviimspakbsblgmfgnvxbnllpavkkckfjjlzolbizbigdbksujdsydphyuvzdlwpopwhfgajwmj"+
                "ubtufnbjakoftqftxrawpupkhmihoxqfgzxxdboyqgvolgecagnexhuuieizhlhxsrqefeikqcluzqzypsmkgkmzdrpsilgudqvbb"+
                "jceltfdbamirhykijczepbrswgmdbxujcbfotwmnjmdhualecpyzusyeetlroakadpxppupmhsmsppniaauwqdjznznqkbakgtyck"+
                "oazajjgypvzenxapjdgasfjfuqejedtdkvsrtgvmfkwxgwywpbnwffjqkjrrvufvkysgdukmpzqsbflnymgzxktqucxsvhzzrxnjy"+
                "dqblluvegrplvokhxpordaokurylggxvvbiiszjnuqjreecvgegqkohxyvmzypavllhbsstdemtlzmdqhlwkgcyqnuedntoztrwft"+
                "vldtkuvwmhrklmxyrcynjgcrizpccvevkwjngmwkyorortkaaiajhomskokyawycbqquqbvpzppxbemjnttcqiblschxiulckqhuf"+
                "eibxrblzemrmjrfnbeqadwaytsobfvzflyasevaygvywvvrcidowqfscgynwuesswbbeecdclxwfdcopctdcbzftwmqkdsfkgjmwc"+
                "iiymzhlmfyaqopxbpikxltckgvitxnxbfitzuusqjnhlynlgptejpgnwebjcsmluwrkmsotihynyuhmyzytzcszmfxwgsbyocxvov"+
                "higjdpnbiuoqpzxanqzpbosxagibrgkgexeqawxnmmcjwawzgmavjffautdzpxgyxurupaqcweqsvzynqlnjoevagatcrmfeokzpi"+
                "ijvgebridzpmwcfhnwclmggxdsffifmkwiondafvnenolwnezwyrhllslogyjcbtpbecikylqivhbrkistbpdfrqhldylbuqfifcb"+
                "ihnacybphorcbyiivhvttswzzfyqygcdqhnptbeystejhuiyvisgjerevxdgkmksicqeyniilobpxivmfhzilqjyekihpuzrferwo"+
                "dnhoxymzfeyphzmzwjuvfqfetxwovkdmwutckxlsrylqmtsvriaiuhnshiuhcvzyxxatmhazrytobddzfxbicwxxspwnsbgpdanmi"+
                "epznyvrinotebesqtgwtseanobufqlqbzqlwzqvkonlnscoqofdcslyauaszvlstlnhzfjqvagxzntzjymlyofoleqphtvukpniaw"+
                "ecbfltyxdtywwgigxsacfcydgkxolhoswbmbjistxsgdlodufbevixjjxivebfudoldgsxtsijbmbwsohloxkgdycfcasxgigwwyt"+
                "dxytlfbcewainpkuvthpqelofoylmyjztnzxgavqjfzhnltslvzsauaylscdfoqocsnlnokvqzwlqzbqlqfubonaestwgtqsebeto"+
                "nirvynzpeimnadpgbsnwpsxxwcibxfzddbotyrzahmtaxxyzvchuihsnhuiairvstmqlyrslxkctuwmdkvowxtefqfvujwzmzhpye"+
                "fzmyxohndowrefrzuphikeyjqlizhfmvixpboliinyeqciskmkgdxverejgsivyiuhjetsyebtpnhqdcgyqyfzzwsttvhviiybcro"+
                "hpbycanhibcfifqublydlhqrfdpbtsikrbhviqlykicebptbcjygolsllhrywzenwlonenvfadnoiwkmfiffsdxggmlcwnhfcwmpz"+
                "dirbegvjiipzkoefmrctagaveojnlqnyvsqewcqapuruxygxpzdtuaffjvamgzwawjcmmnxwaqexegkgrbigaxsobpzqnaxzpqoui"+
                "bnpdjgihvovxcoybsgwxfmzscztyzymhuynyhitosmkrwulmscjbewngpjetpglnylhnjqsuuztifbxnxtivgkctlxkipbxpoqay"+
                "fmlhzmyiicwmjgkfsdkqmwtfzbcdtcpocdfwxlcdceebbwsseuwnygcsfqwodicrvvwyvgyavesaylfzvfbostyawdaqebnfrjmr"+
                "mezlbrxbiefuhqkcluixhcslbiqcttnjmebxppzpvbquqqbcywaykoksmohjaiaaktroroykwmgnjwkvevccpzircgjnycryxmlkr"+
                "hmwvuktdlvtfwrtzotndeunqycgkwlhqdmzltmedtssbhllvapyzmvyxhokqgegvceerjqunjzsiibvvxgglyrukoadropxhkovlp"+
                "rgevullbqdyjnxrzzhvsxcuqtkxzgmynlfbsqzpmkudgsykvfuvrrjkqjffwnbpwywgxwkfmvgtrsvkdtdejequfjfsagdjpaxnez"+
                "kvpygjjazaokcytgkabkqnznzjdqwuaainppsmshmpuppxpdakaorlteeysuzypcelauhdmjnmwtofbcjuxbdmgwsrbpezcjikyhr"+
                "imabdftlecjbbvqduglisprdzmkgkmspyzqzulcqkiefeqrsxhlhzieiuuhxengaceglovgqyobdxxzgfqxohimhkpupwarxtfqtf"+
                "okajbnfutbujmwjagfhwpopwldzvuyhpdysdjuskbdgibziblozljjfkckkvapllnbxvngfmglbsbkapsmiivlbluwxhtainvxktc"+
                "qtcmuwuqwnxcwwqgzulotiuigpiyhzczzhsmaqqsveubaappwlsfgisqdkoyhvfbaobsbztjscbwktppafwihbiipprvsmiztamqr"+
                "eikcirrpvwvxeulyhtssbqxpyhfbzaeufgykphzxsoizszfmnmgjrbztmlrxmxmotyjskqxlpevnsjurokoscogrqcwfxihahocpw"+
                "jffwyohrvikywohrcmdiroatjubosrnovjrlcqqcbmcqifmagbkwzgfyhrymgrxdnhwqtqdescqqbzbqsshcppbrbmusdptvyonjd"+
                "hhcptpoalgtxdhzzodobjhrreycjekzkcquommbtksueuvlvakrltlqmohzjqsmjbqfptuwutmdwginvwqizfyhxlxhqauttctsmp"+
                "krpdejohplpwdvwapuzahloohghpzbnmccxwngmbciykvfdyfqlmewkddkiqdhqsmqkgvkezhhfliuogzwlvqqqrmavxpnkykuijy"+
                "uuvndronlthmbeaebywqauybfyffknrudrlplqaulcpoxfnstljgldpdvjhvfdlnsigrnqafzgozczlrqgiyymrqlqmwqxqweqatm"+
                "pxguapzansancjrdzdmczqomhoaklsuosiztrgfzpyaczfllsckveubojueksgqodqxnxswvnyuwucufdcnicwfalbfcrezrsvhu"+
                "jwtcwozbqtnvjpwzvtykgkrjlzpukbruuxoijrysfgyhnsmprxlxmowddssltrdxkqgttambygrishoffuthboioncdwxqbgtmehd"+
                "amvwqpurokgctfashocelquyoktpcwryujeddglpqnzorbgtfjiorubxoiksnlcmzduujosoqqoejkarueeojwuxjdawvxmssdpuw"+
                "lmcpriejbmlyqbfstleykbszoiupagyrwkqcwmqmwrevaapjqbgywujcvxxohtzboqajwdqiyqynfpxqrxavxxyjenqasizbcgfbs"+
                "oxzrynmzxebbcqedtvwhgaunyudbjqmmuvlxrahhjkiycyjawfrskvpngoqpdwiiwfznbqyxukaxuocrfgplokzggpngwnzgxbhnk"+
                "maucpfqovwuaheiyyxmsvqlhxndurflybodfbcjxdmmzaeywaeiqskcdnrutzokjhqgzpqjlallywfdpahqlveyrjacgewavlvfar"+
                "gdiaoslsvftzwqlhqpxssyoizklresoqxnturamrnoiuwsjjhthgkijbiskrbdhzczbdbvzbxcywbxeuqpqhupsiajiekiqzakun" +
                "tqboxbleusdrhwmcrdqftoyserzsqwjzywxxhxatrobtzsgyuxfnminyxmjpfqufhdzvjnqjfjnotewofttbdwasvkqucuslcpnzu" +
                "gwgeipvqduldzgwgwphawslkmcojblmqplkirphmeayxxqlhycbadmiksgikhgqdoqxudeiojvhypoztzbffjjaiebskgvqujzea" +
                "ubuhradkiegffimbfgagfuiipfjttroiansnprplcxsvdpnfgwvhvgshtohlmwfcxrowgxakuweqpklhhtmffdkfxbjpinjzpiius" +
                "wimpcrvednlldcqnmeylyqprbjkwdqjgbtfangjsttjsjkvxkgoyzwagkumuzsnqugzyqxujiwquvsyoovqsztkukoszrsitzstbx" +
                "enedqziotyqbxhucpdlhruxmflqippcvdgznjdfxkyijzdzusqtbdsgkzfgzjnclfihfspiiysmojbnqcgulyjoqydntvudzhzhbg" +
                "oqmznkkejrhulkvrzqxmvjquqxdzmtprhwzkjctvcccanrebzcuumlhzrhunssrtgctwqpmaioczeltaunaayhybcybjwkcyjyhjq" +
                "wylsuglpggfxmizcbmpuvpxrvsvchuxyqpgoayyudirrjyznllwghdsecjchmriqubboptpincjxocgjpdycsfhabwptyejqcmvwl" +
                "vhpklakuvznxitcnvqljeshjjvwdbhdhlaykkyrrruxtvjahsbacmclxsslchyurhnkytwhhygxqggtdobtwcxuievpyrtcohimwp" +
                "nmyasobfrnqgpnbtrsztaiofxaadhkkbffsvxhyyzdmiioulkkxpusogirspqinskdzhejrxiqmtiuyvkwjkcgdokzkwaiufwfffq" +
                "iuodcbzgfpbmgsovyeqolctwzjtzszbsyagzptpdbbukccmaytpvujxrmfdccwvsyunstpnkxbyrvxotuveweivgcgjcxpstjaike" +
                "obwsztajnhhwvtrrdwwmdzcpelrpzpvzbjgfimuztmrpmhecgvmmaasddrdtctnvpoovjvjgmgpeafzttssupzyztqajafrqdrptdq" +
                "ouauqswqrszjkphdxixjcxgprhoyzkxrdtnbvxccchgadylswhiqfjwfmsjhfmdcwdwwzczrdptcrozonuzfszizaefdvclwazcnk" +
                "anejufkhanuxwdvfecmsixycpfibzolkprdlsjmrdibqtohoxkabpgiyfyuwggnsbdpfkqxdyuwitkbrwldryiekpsskxcaehwgdl" +
                "fxysxvvshwopubmyvznfxwmmohhuraenhwnbonimfwntpodyrzwxgzioujlblpdzojjhjwjdnxcuxayoiryhjnbqryhpitbgwwisxz" +
                "jfacwplwodvvgdkxftfpjeftbfmlkrsrjqsilpsxavttfdrcesesvirbdllznaxaovxjsnnazldzgrznmmjwrgfpfnfaqhoulpnlry" +
                "qeimxbfwksxltrznrmrfsdtloraftybrrhshpouobqpwfnbiqxqnbmdqdmrwhzhtzdvjcvwqmztrjarydskzxokzpbjrpshbuffneh" +
                "lovfgepfdggxwaqrpcxuhgscwfghkcmhbxrfjummsaugwmqawkkaivmtxwclvikopqylatsqkdyrsridwavnxyddfkhwwwrguobkxp" +
                "xjwpghxcomdhdrftpzvnryylczyshjuuxdemixqovhilyguhbutikcjebtgexkpmjqfldzgxcsczplkszviixtxikuahweqgcsjqted" +
                "veexfakmijgicofkvgvkyxcmidrvfrlkqmhhlsmbxeyjtmrthoxspimyvnbucxgdnxwocsmbqlvilkqxgtmhchbxsppsqksaubcvjg" +
                "dnppvymqfkuddzpzdtxounkirlrvaqckymrsluiphanjkxlzoknvoislrkfupauqzjjikkkylkjhzehyirtyyjltxlixflkuechuxa" +
                "ryjfpfdvdlrobzqnnzurmesthbwtzzhyluaiehdxmzlpxbvfnnetbgijwlttcfxquhznsqwghbfrqyfdvkmyxlokjqlflbytjzlgdp" +
                "ctlzjrixbrdytuzveloyhbnzndkibatzppjzblazihoyhhfnicdqgguvfrwibzotwrckphcsifqvtwrfyjinmjcaaqxbmlasjhhstb" +
                "kbjyisqqdotsvoieqofmwqfmiqozujkkqlisdhbzauamshbodejuabobmkqsyfbtlaisgwyglakqhsumddpqmbrqtravwxycjyl";
        s = s.trim();
        System.out.println(validPalindrome(s));
    }

//    private static boolean validPalindrome(String s) {    // ye code chl jaega bs isme time limit exceeded show hora h : time complexity :: O(n^2)
//        String str = reverse(s);
//
//        if (str.equals(s)) {
//            return true;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            String tempstr = remove(i, s);
//            String tempReverse = reverse(tempstr);
//            if (tempReverse.equals(tempstr)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static String remove(int i, String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < s.length(); j++) {
//            if (j != i) {
//                sb.append(s.charAt(j));
//            }
//        }
//        return sb.toString();
//    }
//
//    public static String reverse(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }

        private static boolean validPalindrome(String s) {    //instead, this will work :: time complexity : o(n)
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
                }
                left++;
                right--;
            }

            return true;
        }

        private static boolean isPalindrome(String s, int left, int right) {
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

}
